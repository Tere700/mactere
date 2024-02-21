package Chapter8;

import java.util.Scanner;

public class FileUtil5 {

	public static String readFile(Scanner scanner) {
		StringBuilder text = new StringBuilder();
		try(scanner){
			while(scanner.hasNext()) {
				text.append(scanner.nextLine());
				text.append('\n');
			}
		}
		return text.toString();
	}

}
