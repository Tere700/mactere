package Filexxxit;

import java.io.File;

public class Filemk {

	public static void main(String[] args) {
		File dir5 = new File("/Users/teresa/eclipse-workspace/Brad/dir2/dir3/dir4/dir5");
		if(!dir5.exists()) {
			System.out.println("create dir5");
			dir5.mkdirs(); //mkdir一個folder mkdirs多個folder
		}else {
			System.out.println("dir5 exist!");
		}
	}
}
