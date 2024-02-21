package Filexxxit;

import java.io.File;

public class brad42 {

	public static void main(String[] args) {
		File dir2 = new File("./dir2");
		if(!dir2.exists()) {
			dir2.mkdir();
		}else {
			System.out.println("dir4 exists!");
		}

	}

}
