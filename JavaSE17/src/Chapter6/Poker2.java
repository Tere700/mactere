package Chapter6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Poker2 {
	

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<Integer>();
		for(int i = 0;i<10;i++) {
			poker.add(i);
		}
		Collections.shuffle(poker);
		for(int card:poker) {
			System.out.println(card);
		}
 	}

	
}
