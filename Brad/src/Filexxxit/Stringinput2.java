package Filexxxit;

import java.io.File;
import java.io.FileInputStream;

public class Stringinput2 {

	public static void main(String[] args) {
		File file = new File("dir1/File4.txt");
		long size = file.length();
		try {
			FileInputStream fin = new FileInputStream(file);

			byte[] buf = new byte[(int) size]; // 遇到byte是2或1後面開始就會出現亂碼;
			fin.read(buf);
			System.out.print(new String(buf));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
