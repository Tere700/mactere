package Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {

	public static String readFile(String name) throws FileNotFoundException{
		var text = new StringBuffer();
		try {
			var console = new Scanner(new FileInputStream(name));
			while (console.hasNext()) {
				text.append(console.nextLine()).append('\n');
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw ex;
		}
		return text.toString();
	}
}
