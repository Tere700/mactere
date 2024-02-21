package CollectionMap;

import java.util.HashSet;

class Student{
	private final String name;
	private final String number;

	Student(String name ,String number){
		this.name = name ;
		this.number = number;
	}
	String name() {
		return this.name;
	}
	String number () {
		return this.number;
	}
	
	@Override
	public String toString() {
		return "(%s , %s)".formatted(name,number);
	}

}
public class Students {
	public static void main(String[] args) {
		HashSet students = new HashSet();
		var a = new Student("Justin", "B835031");
		var b = new Student("Monica", "B835032");
		var c = new Student("Justin", "B835031");
		students.add(a);
		students.add(b);
		students.add(c);
		System.out.println(a.hashCode()+" "+b.hashCode()+" "+c.hashCode());
		System.out.println(a.equals(c));

	}
}
