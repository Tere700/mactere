package Chapter9;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ListCollection {
	public static void forEach1(List list) {
		var size = list.size();
		for(var i = 0; i < size ; i++) {
			System.out.println(list.get(i));
		}
	}
	static void forEach2(Set set) {
		for(var obj : set.toArray()) {
			System.out.println(obj);
		}
	}
	static void forEach3(Queue queue) {
		while(queue.peek()!=null) {
			System.out.println(queue.poll());
		}
	}
	static void forEach4(Iterable iterable) {
		var iterator = iterable.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		List<String>  a = new LinkedList<String>();
		a.add("Tere");
		a.add("Jennie");
		a.add("Tony");
		forEach4(a);

	}

}
