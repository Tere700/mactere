package Chapter9;

import java.util.HashMap;

public class MapKeyValue {

	public static void main(String[] args) {
		var map = new HashMap<String, String>();
		map.put("one", "一");
		map.put("two", "二");
		map.put("three", "三");
		map.put("two", "二二");
		map.put("four", "三");
		System.out.println("顯示鍵");
		//map.keySet().forEach(key->System.out.println(key));
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		System.out.println("----------------------------");
		map.values().forEach(key->System.out.println(key));
//		for(String value: map.values()){
//		System.out.println(value);
//		}
		System.out.println("----------------------------");
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
	static void foreach(Iterable<String> iterable) {
		for(var element: iterable) {
			System.out.println(element);
		}
	}
}
