package Chapter9;

import java.util.ArrayDeque;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ForEach2 {

	public static void main(String[] args) {
		var names = Arrays.asList("Lulu","Mina","Yummy");
		names.forEach(out::println);
		System.out.println("---------1");
		new HashSet(names).forEach(out::println);
		System.out.println("---------2");
		new ArrayDeque(names).forEach(out::println);
		System.out.println("---------3");
		names.forEach(name -> System.out.println(name));
		System.out.println("---------4");
		new HashSet(names).forEach(name -> System.out.println(name));
		System.out.println("---------5");
		new ArrayDeque(names).forEach(name -> System.out.println(name));
	}
	
	private static void forEachhh (Iterable iterable) {
		Object o;
		for(Iterator i$ = iterable.iterator();
					i$.hasNext(); //i$裡面沒東西的話就會變成false不會再往下跑
				System.out.println(o)) { 
			o = i$.next();
		}
	}

}
