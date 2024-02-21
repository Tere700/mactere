package Chapter9;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {
		var HP = new HashMap<String, String>();
		HP.put("one","A");
		HP.put("two","B");
		HP.put("three001","C");
		HP.put("two","BC");
		HP.put("three002","C");
		HP.keySet().forEach(key -> System.out.println(key));
		System.out.println("------------------------");
		HP.values().forEach(value -> System.out.println(value));
		System.out.println("////////////////////");
		HP.forEach((key,value) -> System.out.printf("(鍵%s,值%s) %n", key, value));
		System.out.println("------------------------");
		System.out.println(HP.keySet());
		System.out.println("------------------------");
		System.out.println(HP.values());
		System.out.println("------------------------");
		System.out.println(HP.entrySet());
		System.out.println("------------------------");	
		forEach(HP.entrySet());
		System.out.println("------------------------");	
//		for(Map.Entry<String, String> entry: HP.entrySet()) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key);
//			System.out.println(value);
//			System.out.println("------------------------");	
//		}
		
	}
	static void forEach(Iterable<Map.Entry<String, String>> iterable) {
		for( var element: iterable) {
			System.out.printf("(鍵%s 值%s)%n", element.getKey(), element.getValue());
		}
	}
}
