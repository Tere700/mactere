package Chapter9;

import static java.util.Comparator.*;


import java.util.Arrays;

public class Sort6 {

	public static void main(String[] args) {
		var words = Arrays.asList("B", "X", "S", null, "M", "F", "W", "O", null);
		words.sort(nullsFirst(reverseOrder()));
		//words.sort(Comparator.nullsFirst(Comparator.reverseOrder())); 如果不import static是這樣寫
		System.out.println(words);
	}

}