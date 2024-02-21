package Filexxxit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamm {

	public static void main(String[] args) {
		String mesg = "Hello, world!/n";
		byte[] meg = mesg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("dir1/File3.txt", true); //boolean append 在後面繼續寫入
			fout.write(meg);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println("e1");
		} catch (IOException e) {
			System.out.println("e2");
		}

	}

}
