package Chapter9;

import java.util.TreeMap;

public class Messages2 {

	public static void main(String[] args) {
		TreeMap<String, String> TM = new TreeMap<String, String>((s1, s2)-> -s1.compareTo(s2));
		TM.put("Justin", "Hello!Justin的訊息！");
		TM.put("Mandy", "給Mandy的悄悄話！");
		TM.put("Jasmine", "Jasmine的可愛喵喵叫");
		TM.put("Bobo", "Jasmine的可愛喵喵叫");
		TM.put("Abby", "Abby的同事");
		System.out.println(TM);
	}

}