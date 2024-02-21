package Chapter9;

import java.util.ArrayList;
import java.util.Collections;

public class UnmodifiablexxXX {

	public static void main(String[] args) {
		var names = new ArrayList<String>();
		names.add("Anny");
		names.add("Borris");
		names.add("Candy");
		names.add("Dris");
		names.add("Fanny");
		names.add("Grace");
		
		var UN = Collections.unmodifiableList(names);
		System.out.println(UN.containsAll(names));
		System.out.println(UN.get(0));
		//UN.add("EEE"); 會跑出UnsupportedOperationException錯誤
	}

}
