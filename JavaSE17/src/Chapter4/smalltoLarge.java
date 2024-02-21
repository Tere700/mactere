package Chapter4;

import java.util.Arrays;

public class smalltoLarge {

	public static void main(String[] args) {
		int[] number = { 70, 80, 31, 37, 10, 1, 48, 60, 33, 80 };
		Sol ss = new Sol();
		ss.arry(number);

	}

	static class Sol {
		public void arry(int[] number) {
			for(int i = 0; i< number.length-1; i++) {
				for (int j = 0; j<number.length-i-1; j++) {
					int temp;
					if(number[j]>number[j+1]) {
						temp = number[j];
						number [j]= number[j+1];
						number[j+1]=temp;
					}
				}
			}System.out.println(Arrays.toString(number));
		}
	}
}
