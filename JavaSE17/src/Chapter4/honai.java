package Chapter4;

import java.util.Scanner;

public class honai {

	static class Move {
		public void Hanoi(int n, char a, char b, char c) {
			if (n == 1) {
				System.out.println(a + " move to " + c);
			} else {
				System.out.println("第一次呼叫");
				Hanoi(n - 1, a, c, b);
				System.out.println("第二次呼叫");
				System.out.println(a + " move to " + c);
				System.out.println("第三次呼叫");
				Hanoi(n - 1, b, a, c);
			}
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Move mo = new Move();
		mo.Hanoi(n, 'A', 'B', 'C');
	}
}
