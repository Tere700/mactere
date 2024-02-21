package Chapter6;

import java.util.Scanner;

public class ConsoleGame extends GuessNumber {

	private Scanner scan = new Scanner(System.in);

//	@Override
//	public void print(String text) {
//		System.out.println(text);
//
//	}

	@Override
	public int nextInt() {
		return scan.nextInt();
	}

}
