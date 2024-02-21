package iii.brad.tw;

import java.io.IOException;

public class TryCatch2 {

	public static void main(String[] args) {
		try {
			int ch = System.in.read();
			System.out.println(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
