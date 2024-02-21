package Chapter9;

public class SimpleLinkedList {
	public static void main(String[] args) {
		SimpleLinkedList s= new SimpleLinkedList();
		s.add("a");
		s.add("r");
		System.out.println(s.first.o);
	}
	private class Node{
		Object o;
		Node next;
		Node(Object o){
			this.o = o ;
		}
	}
	private Node first;
	
	public void add (Object elem) {
		var node = new Node (elem);
		if(first == null) {
			first = node;
		}else {
			append(node);
		}
	}
	private void append(Node node) {
		var last = first;
		while(first.next != null) {
			last = last.next;
		}
		last.next = node;
	}
	public int size() {
		var count = 0;
		var last = first;
		while(last != null) {
			last = last.next;
			count++;
		}
		return count;
	}
	public Object get (int index) {
		checkSize(index);
		return findElemOf(index);
	}
	private void checkSize(int index) throws IndexOutOfBoundsException{
		var size = size();
		if(index>=size) {
			throw new IndexOutOfBoundsException(
				"Index: %d, Size: %d" .formatted(index, size));
			}
	}
	private Object findElemOf(int index) {
		var count = 0;
		var last = first;
		while(count < index) {
			last = last.next;
			count++;
		}
		return last.o;
	}

}
