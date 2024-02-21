package Chapter9;

import java.util.Arrays;

public class ArrayList <E> {
	private Object[] elems;
	private int next;
	
	public ArrayList (int capacity) {
		elems = new Object[capacity];
	}
	
	public ArrayList() {
		this(16);
	}
	
	public void add(E e) {
		if(next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length*2);
		}
		elems[next++] = e;
	}
	
	public E get(int index) {
		return(E) elems[index];
	}
	
	public int size() {
		return next;
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Monica");
		names.add("Ted");
		String name1 = names.get(0);
		String name2 = names.get(1);
		System.out.println(name1);
		System.out.println(name2);
	}

}
