package Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil3 {
	public static void main(String[] args) {
		String s ="/Users/teresa/eclipse-workspace/Brad/dir1/File1.txt";
		try {
			System.out.println(readFile(s));
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
	public static String readFile(String name)
			throws FileNotFoundException{
		var text = new StringBuilder();
		var console = new Scanner(new FileInputStream(name));
		Throwable localthrowable2 = null;
		try{
			while(console.hasNext()) {
				text.append(console.nextLine())
					.append('\n');
				
			}
		}catch(Throwable localthoroable1) {
			localthrowable2 = localthoroable1;
			throw localthoroable1;
		}
		finally {
			if(console!=null) {
				if(localthrowable2 != null) {
					try {
						console.close();
					}catch(Throwable x2) {
						localthrowable2.addSuppressed(x2);
					}
				}else {
					console.close();
				}
			}
		}
		return text.toString();
	}
}
