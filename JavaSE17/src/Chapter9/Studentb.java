package Chapter9;

import java.util.List;

public class Studentb {
	final String name;
	Studentb(String name){
		this.name = name;
	}
	

	public static void main(String[] args)  {	
		var student = new Studentb("Justin");
		System.out.println(student);
		//student.name = "Justin";
		var students = List.of(student);
		//student.name = "Monica";
		System.out.println(students.get(0).name);

	}
}
