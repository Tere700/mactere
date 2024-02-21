package Chapter4;

import java.util.Arrays;

public class cashCard {

	public static void main(String[] args) {
		int nums = 52;
		int[] poker = new int[nums];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;
		for (int j = nums - 1; j > 0; j--) {
			int rand = (int) (Math.random() * (j + 1));
			int temp;
			temp = poker[j];
			poker[j] = poker[rand];
			poker[rand] = temp;
		}
		int[][]players = new int [4][13];
		String[] launches = {"黑桃", "紅心", "梅花", "磚塊"};
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < poker.length; i++) {
			players[i%4][i/4]=poker[i];
		}
		for(int[]player: players) {
			Arrays.sort(player);
			for(int m : player) {
				System.out.print(launches[m/13] + values[m%13]+ " ");
			}
			System.out.println();
		}
	}
}
