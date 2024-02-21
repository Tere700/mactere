package Chapter9;

import java.util.Arrays;
import java.util.List;

public record Rstudentf(String name) {
	public static void main(String[] args) {
		var student = new Rstudentf("Justin");
		var students = List.of(student);
		System.out.println(students);
		String[] namess = {"Justin", "Monica"};
		var nameLt = Arrays.asList(namess);
		namess[0] = "Irene";
		System.out.println(nameLt);
	}
}
