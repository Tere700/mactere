package Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		IOn.dump(new FileInputStream(args[0]), new FileOutputStream(args[1]));
	}
}