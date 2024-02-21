package Chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		var props = new Properties();
		props.load(new FileInputStream("src/Chapter9/person.properties"));
		System.out.println(props.getProperty("cc.openhome.username"));
		System.out.println(props.getProperty("cc.openhome.password"));
		
	}

}
