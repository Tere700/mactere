package Filexxxit;

import java.io.File;

public class RenameToo {

	public static void main(String[] args) {
		File f1 = new File("./dir1/File1.txt");
		File f2 = new File("./dir2/File1.txt");
		f1.renameTo(f2);
	}
}
