package Filexxxit;

import java.io.FileInputStream;

public class Filedowhile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/File2.txt");
			int data;
			do{
				data = fin.read();
				if(data!=-1) {
					System.out.print((char)data);
				}
			}while(data!=-1);
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}