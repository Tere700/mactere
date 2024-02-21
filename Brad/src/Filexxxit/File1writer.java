package Filexxxit;

import java.io.FileWriter;
import java.io.IOException;

public class File1writer {

	public static void main(String[] args) {
		
		String mesg = "大家好, my name is Teresa!";
		FileWriter FW;
		try {
			FW = new FileWriter("dir1/File2.txt");
			FW.write(mesg);
			FW.flush();
			FW.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	

	}

}
