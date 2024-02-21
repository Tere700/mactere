package CollectionMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collentNameTo(names);
		printUpperCase(names);
	}

	static void collentNameTo(List names) {
		Scanner console = new Scanner(System.in);
		System.out.println("請輸入使用者: ");
		while (true) {
			String name = console.nextLine();
			if (name.equals("quit")) {
				break;
			}
			names.add(name);

		}
	}
		static void printUpperCase(List names){
			for(int i = 0 ;i<names.size();i++) {
				String name= (String)names.get(i);
				System.out.println(name.toUpperCase());
			}
	}
}
