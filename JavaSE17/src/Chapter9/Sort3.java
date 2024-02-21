package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class StringCompar implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}

public class Sort3 {

	public static void main(String[] args) {
		var words = Arrays.asList("B", "X", "S", "M", "C", "F", "W", "O", "A");
		Collections.sort(words, new StringCompar());
		System.out.println(words);

	}

}
