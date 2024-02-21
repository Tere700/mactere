package Chapter9;

import java.util.Map;
import java.util.TreeMap;

public class IterableTreeM {

	public static void main(String[] args) {
		var n = new TreeMap<String, String>();
		n.put("AAA", "1");
		n.put("BBB", "2");
		n.put("CCC", "3");
		n.put("DDD", "4");
		n.put("EEE", "5");
		IterableStringg.forEach11(n.entrySet());
	}
	static class IterableStringg{
		static void forEach11(Iterable<Map.Entry<String, String>> iterable) {
			for(var entry : iterable) {
				System.out.printf("(鍵%s, 值%s)%n" ,entry.getKey(), entry.getValue());
			}
		}
	}

}
