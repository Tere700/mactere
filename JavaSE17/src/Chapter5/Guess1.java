package Chapter5;

import java.util.Scanner;

public class Guess1 {

	public static void main(String[] args) {
		var console = new Scanner(System.in);
		var guess = -1;
		var number = (int) (Math.random() * 10);
		do {
			System.out.print("請輸入數字：");
			guess = console.nextInt();
		} while (guess != number);
		System.out.println("猜中了");
	}

}
