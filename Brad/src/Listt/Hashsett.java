package Listt;

import java.util.Iterator;
import java.util.TreeSet;

public class Hashsett {

	public static void main(String[] args) {
		// HashSet<Integer> set = new HashSet<>();//不會重複 沒有順序性
		TreeSet<Integer> set = new TreeSet<Integer>();// 不會重複 有順序性
		while (set.size() < 6) {
			set.add((int) (Math.random() * 49 + 1));
		}
		System.out.println(set);
		Iterator<Integer> u = set.iterator();
		while (u.hasNext()) {
			Integer ii = u.next();
			System.out.println(ii);
			// System.out.println(u.next());
		}
		System.out.println("------");
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
