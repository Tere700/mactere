package Chapter6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TArrayList {

	private Object[] elems;
	private int next;

	public TArrayList(int capacity) {
		elems = new Object[capacity];
	}

	public TArrayList() {
		this(16);
	}

	public void add(Object o) {
		if (next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length * 2);
		}
		elems[next++] = o;
	}

	public Object get(int index) {
		return elems[index];
	}

	public int size() {
		return next;
	}
	@Override
	public String toString() {
		StringBuilder bf = new StringBuilder("[");
		for(int i = 0; i < size(); i++) {
			bf.append(get(i));
			if(i<size()-1) {
				bf.append(", ");
			}
		}
		bf.append("]");
		return bf.toString();
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof TArrayList) {
			TArrayList newother = (TArrayList) other;
			if (this.size() == newother.size()) {
				for (int i = 0; i < this.size(); i++) {
					Object thisElements = this.get(i);
					Object otherElements = newother.get(i);
					if (!Objects.equals(thisElements, otherElements)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		var names = new TArrayList();
		collectNameTo(names);
		System.out.println("訪客名單：");
		var names1 = new TArrayList();
		collectNameTo(names1);
		System.out.println("訪客名單：");
		System.out.println(names.equals(names1));
//		printUpperCase(names);
//		System.out.println(names);
	}

	static void collectNameTo(TArrayList names) {
		var userInput = new Scanner(System.in);
		while (true) {
			System.out.print("訪客名稱：");
			var name = userInput.nextLine();
			if (name.equals("quit")) {
				break;
			}
			names.add(name);
		}
	}

	static void printUpperCase(TArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			var Upper = (String) names.get(i);
			System.out.println(Upper.toUpperCase());
		}
	}
}
