package Chapter3;

public class GCD {

	public static void main(String[] args) {
		int a = 2000;
		int b = 495;

		Solution sol = new Solution();
		System.out.println("The GCD of " + a + " and " + b + " is: " + sol.findFCD(a, b));

	}

	static class Solution {
		public int findFCD(int a, int b) {
			if(b==0) return a;
			return findFCD(b,a%b);
		}
	}
}
//	        while(b!=0) {
//	        	int temp = b;
//	        	b = a % b;
//	        	a = temp;
//	        }
//	        return a;
//	    }
