package Chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] scores1 = new int[] { 88, 72, 77, 54, 78, 56, 84, 76 };
		int[] scores2 = Arrays.copyOf(scores1, scores1.length);
		for (int v : scores2) {
			System.out.printf("%d \t", v);
		}
		System.out.println();
		scores2[3] = 100;
		scores2[0] = 200;
		for (int v : scores2) {
			System.out.printf("%d \t", v);
		}
		System.out.println();
		for (int b : scores1) {
			System.out.printf("%d \t", b);
		}
		System.out.println();
		int[] scores3 = Arrays.copyOf(scores2, scores2.length * 2);
//		scores3[9] = 11;
//		scores3[10] = 12;
//		scores3[11] = 13;
//		scores3[12] = 14;
//		scores3[13] = 15;
//		scores3[14] = 6;
//		scores3[15] = 7;
		for (int k : scores3) {
			System.out.printf("%d \t", k);
		}
	}
}
