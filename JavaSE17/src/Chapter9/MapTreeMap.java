package Chapter9;

import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {

	public static void main(String[] args) {
		var TR = new TreeMap<String, String>();
		TR.put("onee","AA");
		TR.put("twoo","BB");
		TR.put("threee","CC");
		TR.put("twoo","BC");
		TR.put("three002","CC");
		TR.keySet().forEach(key -> System.out.println(key));
		System.out.println("------------------------");
		TR.values().forEach(value -> System.out.println(value));
		System.out.println("oooooooo");
		TR.forEach((key, value) -> System.out.printf("鍵%s, 值%s %n", key, value));
		System.out.println("------------------------");
		System.out.println(TR.keySet());
		System.out.println("------------------------");
		System.out.println(TR.values());
		System.out.println("------------------------");
		System.out.println(TR.entrySet());
		System.out.println("------------------------");
		forEach(TR.entrySet());
//		for(Map.Entry<String, String> entry: TR.entrySet()) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key);
//			System.out.println(value);
//			System.out.println("------------------------");
//		}
	}
	static void forEach(Iterable<Map.Entry<String, String>> iterable) {
		for(Map.Entry<String, String> element: iterable) {
			System.out.printf("(鍵%s ,值%s) %n", element.getKey(), element.getValue());
		}
	}

}
