package Chapter9;

import java.util.HashSet;
import java.util.Objects;

public class Students3 {
	public static void main(String[] args) {
		var students = new HashSet<Student3>();
		students.add(new Student3("Justin", "B835031"));
		students.add(new Student3("Monica", "B835032"));
		students.add(new Student3("Justin", "B835031"));
		System.out.println(students);
	}
}

record Student3 (String name, String number) {};
