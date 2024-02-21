package Chapter9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Guest {

	public static void main(String[] args) {
		var names = new LinkedList();
		collectionNameTo(names);
		System.out.print( "訪客名單：");
		printUpperCase(names);
	}
	static void collectionNameTo(List names) {
		var console = new Scanner(System.in);
		while(true) {
			System.out.printf("訪客名稱：");
			var name = console.nextLine();
			if(name.equals("quit")) {
				break;
			}
			names.add(name);
		}
	}
	static void printUpperCase(List names) {
		for(var i=0; i<names.size(); i++) {
			var name = (String) names.get(i);
			System.out.println(name.toUpperCase());
		}
	}
}
