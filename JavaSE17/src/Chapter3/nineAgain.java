package Chapter3;

import java.util.ArrayList;
import java.util.List;

public class nineAgain {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("Armstrong" + sol.findFd());

	}

	static class Solution {
		public List<Integer> findFd() {
			List<Integer> armstringNumber = new ArrayList<>();
			for (int i = 100; i <= 999; i++) {
				int a = i / 100;
				int b = (i % 100) / 10;
				int c = i % 10;
				if (a * a * a + b * b * b + c * c * c == i) {
					armstringNumber.add(i);
				}
			}
			return armstringNumber;
		}
	}
}
