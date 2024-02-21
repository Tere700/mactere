package Chapter9;

import java.util.Deque;
import java.util.LinkedList;

public class Excercise2 {

	public static void main(String[] args) {
		String[] words = {"RADAR","WARTER START","MILK KLIM","RESERVERED","IWI"};
		for(var ward:words) {
			if(isReversedWord(ward)) {
				System.out.println(ward);
			}
		}

	}
	
	private static boolean isReversedWord(String word) {
		var CD = toDeque(word.toCharArray());
		Character c1, c2;
		c1 = CD.pollFirst();
		c2 = CD.pollLast();
		
		if(c1 !=  null && c2 !=null) {
			if(!c1.equals(c2)) {
				return false;
			}
		}
		
		return true;
	}

	private static Deque<Character> toDeque(char[]cs){
		
		var deque = new LinkedList<Character>();
		for(var c : cs) {
			deque.offer(c);
		}
		
		return deque;
		
	}
}
