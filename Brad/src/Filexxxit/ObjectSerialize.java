package Filexxxit;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialize {

	public static void main(String[] args) {
		Student s1 = new Student("Brad", 87, 54, 70);
		System.out.println(s1.getName() + ":" + s1.avg());
		
		try (FileOutputStream fout = new FileOutputStream("dir1/score1.brad");
			ObjectOutputStream oout = new ObjectOutputStream(fout)
				) { //具有可以自動關閉的物件;
			oout.writeObject(s1);
			oout.flush();
			System.out.println("OK");
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

class Student implements Serializable{
	private String name;
	private int ch, eng, math;

	public Student(String name, int ch, int eng, int math) {
		this.name = name;
		this.ch = ch;
		this.eng = eng;
		this.math = math;
	}

	public int sum() {
		return ch + eng + math;
	}

	public double avg() {
		return sum() / 3.0;
	}

	public String getName() {
		return name;
	}
}
