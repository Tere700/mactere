package Chapter9;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ForEach1 {

	public static void main(String[] args) {
		var names = Arrays.asList("Hustin","Tere","Mety");
		forEachXdd(names);
		System.out.println("----------");
		forEachXdd(new HashSet(names));
		System.out.println("----------");
		forEachXdd(new ArrayDeque(names));
		
	}
	static void forEachXdd (Iterable iterable) {
		for (var obj : iterable) {
			System.out.println(obj);
		}
	}

}
