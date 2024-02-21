package Filexxxit;

import java.io.FileInputStream;

public class Stringinput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/File4.txt");
			byte[]buf = new byte[3]; //遇到byte是2或1後面開始就會出現亂碼;
			int data;
			while((data=fin.read(buf))!=-1){
				System.out.print(new String(buf));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
