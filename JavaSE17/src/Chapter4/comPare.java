package Chapter4;

import java.util.Collections;
import java.util.LinkedList;

public class comPare {

	public static void main(String[] args) {
		LinkedList<Integer> pocker = new LinkedList<Integer>();
		for (int i = 0; i < 52; i++)
			pocker.add(i);
		Collections.shuffle(pocker);
		for (Integer n : pocker) {
			System.out.println(n);
		}
	}

}
