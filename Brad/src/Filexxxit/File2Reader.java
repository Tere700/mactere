package Filexxxit;

import java.io.FileReader;

public class File2Reader {

	public static void main(String[] args) {
		FileReader FR;
		try {
			FR = new FileReader("dir1/File2.txt");
			int c;
			while((c=FR.read())!=-1) {
				System.out.print((char)c);
			}
			FR.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	

	}

}
