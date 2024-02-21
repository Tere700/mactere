package Chapter3;

import java.util.Scanner;

public class sysTemin {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number = (int)(Math.random()*10);
		int guess = -1;
		do {
			System.out.printf("猜數字0~9:");
			guess = scan.nextInt();
		}while(number != guess);
		System.out.printf("You got it");
	}
}
