package Filexxxit;

import java.io.FileInputStream;

public class whilefile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/File3.txt");
			int data;
			while ((data = fin.read()) != -1) {
				System.out.print((char) data);
			}

			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}