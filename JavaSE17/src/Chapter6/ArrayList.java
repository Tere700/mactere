package Chapter6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList {

	private Object[] elems;
	protected int next;

	public ArrayList(int capacity) {
		elems = new Object[capacity];
	}

	public ArrayList() {
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
		StringBuffer s = new StringBuffer();

		for(int i = 0 ;i<size();i++) {
			s.append(get(i));
			
			s.append("\n");
			
			
		
	}
		return s.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof ArrayList array) {
			if(size()==array.size()) {
				boolean b =true;
				for(int i=0;i<size();i++) {
					b=get(i).equals(array.get(i));
					if(b==false) {
						break;
					}
					
				}
				return b;
			}
					
					
		}
		return false;
	}

	public static void main(String[] args) {
		var name1 = new ArrayList();
		collectNameTo(name1);
		System.out.println("訪客名單：");
		//printUpperCase(names);
		var name2 = new ArrayList();
		collectNameTo(name2);
		System.out.println("訪客名單：");
		System.out.println(name1.equals(name2));
	}

	static void collectNameTo(ArrayList names) {
		var userInput = new Scanner(System.in);
		while (true) {
			System.out.print("訪客名稱：");
			var name = userInput.nextLine();
			if (name.equals("quit")) {
				break;
			}names.add(name);
		}
	}


	static void printUpperCase(ArrayList names) {
		for(int i = 0; i < names.size(); i++) {
			var Upper = (String)names.get(i);
			System.out.println(Upper.toUpperCase());
		}
	}
}
