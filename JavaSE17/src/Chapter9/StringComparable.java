package Chapter9;

import java.util.Arrays;
import java.util.Collections;

public class StringComparable {

	public static void main(String[] args) {
		var words = Arrays.asList("B", "X", "S", "M", "F", "W", "O");
		Collections.sort(words);
		System.out.println(words);
		System.out.println("--------");
		words.sort((s1,s2) -> -s1.compareTo(s2));
		System.out.println(words);
		System.out.println("--------");
		words.sort(String::compareTo);
		System.out.println(words);
	}
}
