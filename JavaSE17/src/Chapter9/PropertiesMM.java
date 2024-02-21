package Chapter9;

import java.util.Properties;

public class PropertiesMM {

	public static void main(String[] args) {
		var props = new Properties();
		props.setProperty("username", "Justine");
		props.setProperty("password", "123456");
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
	}

}
