package Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil4 {

	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder text = new StringBuilder();
		try (Scanner console = new Scanner(new FileInputStream(name))) {
			Throwable localThrowable2 = null;
			try {
				while (console.hasNext()) {
					text.append(console.nextLine()).append('\n');
				}
			} catch (Throwable localThrowable1) {
				localThrowable2 = localThrowable1;
				throw localThrowable1;
			} finally {
				if (console != null) {
					if (localThrowable2 != null) {
						try {
							console.close();
						} catch (Throwable x2) {
							localThrowable2.addSuppressed(x2);
						}
					} else {
						console.close();
					}
				}
			}
		} catch (

		FileNotFoundException ex) {
			ex.printStackTrace();
			throw ex;
		}
		return text.toString();
	}
}