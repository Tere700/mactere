package CollectionMap;

import java.util.LinkedList;

public class test {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		LinkedList list = new LinkedList();
		list.offer(d);
		list.offer(a);
		list.offer(b);
		list.pollLast();
		
		System.out.println(list);

	}

}