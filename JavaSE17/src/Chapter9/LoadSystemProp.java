package Chapter9;

public class LoadSystemProp {

	public static void main(String[] args) {
		var props = System.getProperties();
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		
	}

}