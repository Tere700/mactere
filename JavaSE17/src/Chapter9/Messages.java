package Chapter9;

import java.util.HashMap;
import java.util.Scanner;

public class Messages {

	public static void main(String[] args) {
		var messages = new HashMap<String, String>();
		messages.put("Justin", "Hello!Justin的訊息！");
		messages.put("Mandy", "給Mandy的悄悄話！");
		messages.put("Jasmine", "給Jasmine的悄悄話！");
		messages.put("Jasmine", "Jasmine的可愛喵喵叫");
		var console = new Scanner(System.in);
		System.out.println("取得誰的消息：");
		String message = messages.get(console.nextLine()); // 指定鍵取回值;
		System.out.println(message);
		System.out.println(messages);
	}

}