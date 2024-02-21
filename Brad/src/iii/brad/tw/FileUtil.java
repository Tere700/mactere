package iii.brad.tw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

	public static void main(String[] args) throws FileNotFoundException  {
		String s ="/Users/teresa/eclipse-workspace/Brad/dir1/File1.txt";
		System.out.println(readFile(s));
		
	}

	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder text = new StringBuilder();
		Scanner console = new Scanner(new FileInputStream(name));
		while(console.hasNext()) {
			text.append(console.next())
				.append("\n");
		}
		return text.toString();
	}
}
