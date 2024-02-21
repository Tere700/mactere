package Chapter9;

import java.util.Deque;
import java.util.LinkedList;

public class Ecercisee {
	public static void main(String[] args) {
		String[] words = { "RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI" };
		for (var word : words) {
			if(isReversable(word)) {
				System.out.println(word);
			}
		}
	}
	public static boolean isReversable(String words) {
		var CD = ToDeque(words.toCharArray());
		var CD1 = CD.pollFirst();
		var CD2 = CD.pollLast();
		if(CD1!=null && CD2!=null) {
			if(!CD1.equals(CD2)) {
				return false;
			}
		}
		
		return true;
		
		
	}

	public static Deque<Character> ToDeque(char[] cs) {
		var deque = new LinkedList<Character>();
		for (var c:cs) {
			deque.offer(c);
		}
		return deque;
	}
}