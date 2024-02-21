package Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOn {
	public static void dump(InputStream ins, OutputStream ous) throws IOException {
		try (ins; ous) {
			var data = new byte[1024];
			var length = 0;
			while ((length = ins.read(data)) != -1) {
				ous.write(data, 0, length);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		try {
			InputStream ins = new FileInputStream("/Users/teresa/Desktop/Hell.txt");
			OutputStream ous = new FileOutputStream("/Users/teresa/Desktop/Hell 2.txt");
			dump(ins,ous);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
