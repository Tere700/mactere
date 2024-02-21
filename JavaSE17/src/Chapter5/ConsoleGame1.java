package Chapter5;

import java.util.Scanner;

public class ConsoleGame1 extends GuessGame1 {

	private Scanner console = new Scanner(System.in);

	@Override
	public void print(String text) {
		System.out.print(text);
		
	}

	@Override
	public int nextInt() {
		return console.nextInt();
	}

}
