package Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandardIn {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("/Users/teresa/Desktop/Hell.txt"));
		try (var file = new Scanner(System.in)) { //自動關閉Scanner, 而Scanner操控System.in取得資料
			//當 try 區塊結束時，Scanner 的 close 方法被自動調用，這將關閉與 System.in 的連接
			while (file.hasNextLine()) {
				System.out.println(file.nextLine());
			}
		}

	}

}
