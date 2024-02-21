package Chapter4;

import java.util.Scanner;

public class hanoi {

		    static class Move {
		        public void Hanoi(int n, char a, char b, char c) {
		            if (n == 1) {
		                System.out.println(a + " move to " + c);
		            } else {
		                Hanoi(n - 1, a, c, b);  // 將前 n-1 個盤子從柱子 a 移動到柱子 b
		                System.out.println(a + " move to " + c);  // 將第 n 個盤子從柱子 a 移動到柱子 c
		                Hanoi(n - 1, b, a, c);  // 將前 n-1 個盤子從柱子 b 移動到柱子 c
		            }
		        }
		    }

		    public static void main(String args[]) {
		        Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();
		        Move mo = new Move();
		        System.out.println("Initial State: ");
		        printState(n, 'A', 'B', 'C');
		        System.out.println("\nMove Steps: ");
		        mo.Hanoi(n, 'A', 'B', 'C');
		    }

		    private static void printState(int n, char a, char b, char c) {
		        System.out.println("Peg A: " + (n > 0 ? "◼".repeat(n) : "empty"));
		        System.out.println("Peg B: " + (n > 0 ? "" : "empty"));
		        System.out.println("Peg C: " + (n > 0 ? "" : "empty"));
		        System.out.println("------------------------");
		    }


	}

