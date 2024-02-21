package Chapter9;

import java.util.Arrays;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		var numbers = Arrays.asList(1, 5, 3, 6, 7, 2, 3);
		Collections.sort(numbers);
		System.out.println(numbers);
	}

}
