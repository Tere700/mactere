package Filexxxit;

import java.io.File;

public class fileewko {

	public static void main(String[] args) {
		File f1 = new File("./src");
		System.out.println(f1.exists());
		if(f1.isDirectory()) {
			File[]subs = f1.listFiles();
			for(File sub:subs) {
				System.out.println(sub.lastModified());
			}
		}
		
	}

}
