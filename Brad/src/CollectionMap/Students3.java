package CollectionMap;

import java.util.*;

public class Students3 {

	public static void main(String[] args) {
		HashSet students = new HashSet();
		var a = new Student3("Justin", "B835031");
		var b = new Student3("Monica", "B835032");
		var c = new Student3("Justin", "B835031");
		students.add(new Student3("Justin", "B835031"));
		students.add(new Student3("Monica", "B835032"));
		students.add(new Student3("Justin", "B835031"));
		System.out.println(students);

	}
}

record Student3(String name, String number) {}
