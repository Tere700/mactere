package Chapter9;

import java.util.Iterator;

public class IterableString implements Iterable<Character>{

	private String original;
	
	 IterableString (String original){
		 this.original = original;
	 }

	@Override
	public Iterator<Character> iterator() {
		return new InnerIterator();
	}
	
	public class InnerIterator implements Iterator<Character>{
		
		int index;

		@Override
		public boolean hasNext() {
			return index<original.length();
		}

		@Override
		public Character next() {
			var c = original.charAt(index);
			index++;
			return c;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

}
