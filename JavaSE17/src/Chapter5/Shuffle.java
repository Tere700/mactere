package Chapter5;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<Integer>();
		for(int i = 0; i < 52; i++) poker.add(i);
		Collections.shuffle(poker);
		for(int x : poker) {
			System.out.println(x);
		}
	}

}
