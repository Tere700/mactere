package Filexxxit;

import java.io.FileInputStream;

public class FileinputStreamm {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/file2.txt");
			byte[]buf = new byte[2]; //byte[3]會溢出字元
			int d =0;
			while ((d = fin.read(buf)) != -1) {
				System.out.print(new String (buf));
			}
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
