package Chapter8;

import java.io.File;

public class Tee {

	public static void main(String[] args) {
		File dir2 = new File("/Users/teresa/Downloads/dir2");
		if(!dir2.exists()) {
			dir2.mkdir();
		}else {
			System.out.println("dir2 exist!");
		}
	}
}
