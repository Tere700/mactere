package Chapter9;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Stack {
	private Deque elems = new ArrayDeque();
	private int capacity;
	
	private Stack(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean push (Object elem) {
		if(isFull()) {
			return false;
		}
		return elems.offerLast(elem);
	}
	
	private boolean isFull() {
		return elems.size() +1 > capacity;
	}
	
	public Object pop() {
		return elems.pollLast();
	}
	
	public Object peek() {
		return elems.peekLast();
	}
	
	public int size() {
		return elems.size();
	}
	
	public static void main(String[] args) {
		var stack = new Stack(5);
		stack.push("Justin");
		stack.push("Monica");
		stack.push("Teresa");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		var names = Arrays.asList("Hustin", "Amy","Abby");
		var name = (String)names.get(0);
		System.out.println(name);
	}

}
