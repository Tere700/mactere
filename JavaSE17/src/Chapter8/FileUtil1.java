package Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil1 {

	public static String readFile(String name) throws FileNotFoundException {
		var text = new StringBuffer();
		Scanner console = null;
		try {
			console = new Scanner(new FileInputStream(name));
			while (console.hasNext()) {
				text.append(console.nextLine()).append('\n');
			}
		} finally {
			if (console != null) {
				console.close();
			}
		}
		return text.toString();
	}
}
