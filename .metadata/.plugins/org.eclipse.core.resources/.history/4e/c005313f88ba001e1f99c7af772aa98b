package Filexxxit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Obdeserialization {

	public static void main(String[] args) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir1/score1.brad"))){
			Object obj = ois.readObject(); 
			Student s1 = (Student) obj;
			System.out.println(s1.getName()+":"+s1.avg());
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}