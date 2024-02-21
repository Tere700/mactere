package Filexxxit;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Maydayvideo2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/Mayday.MOV");
			FileOutputStream fout = new FileOutputStream("dir2/Mayday1.MOV");
			int len;
			byte[]buf = new byte[1024*1024]; //用buf跑會跑更快
			while((len = fin.read(buf))!=-1) {
				fout.write(buf,0,len);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("Finishuu" + (System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
