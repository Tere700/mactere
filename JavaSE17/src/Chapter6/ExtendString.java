package Chapter6;

import java.util.Date;

public class ExtendString {

	public static void main(String[] args) {
		Object o1 = "Justin";
		Object o2 = new Date();
		Object objs[] = { "Monica", new Date(), new SwordsMan() };
		var name = (String) objs[1];
		var date = (Date) objs[2];
		var swordsMan = (SwordsMan) objs[3];
	}

}
