package Chapter4;

import java.util.Scanner;

public class fiBonAcci {

	public static void main(String[] args) {
		 var scan = new Scanner (System.in);
		 int n;
		 System.out.println("請輸入數字:");
		 n = scan.nextInt();
		 Sol sol = new Sol();
		 System.out.println(sol.focai(n));
		 
	}

		static class Sol {
			public int focai(int n) {//這是建構式
				if(n<=1) {
					return n;
				}else {
					return focai(n-1)+ focai(n-2); //遞迴recursion
				}
			}
		}
	}

