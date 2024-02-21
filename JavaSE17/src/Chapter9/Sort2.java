package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

record Customer2(String id, String name, int age) implements Comparable<Customer2>{
	//record裡面本來就自動會有建構式
	//private String id;
	//private String name;
	//private int age;
	//public Customer2 (String id, String name, int age){
	//	this.id = id;
	//	this.name = name;
	//	this.id = id;
	//}
	
	@Override
	public int compareTo(Customer2 o) {
		return this.age - o.age;
	}
	
}

public class Sort2 {

    public static void main(String[] args) {
        List accounts = Arrays.asList( //var改成List雖然邊議會過但是會跳錯java.lang.ClassCastException
                new Customer2("X1234", "Justin", 46),
                new Customer2("X1235", "Monica", 10),
                new Customer2("X1236", "Sherry", 29)
        );
        Collections.sort(accounts);
        System.out.println(accounts);
    }
}
