package Chapter6;

import java.util.Arrays;

public class Pokerrr {

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
		int[][] players = new int[4][13];
//		String[] launches = {"黑桃", "紅心", "梅花", "磚塊"};
//		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
		}
		for (int[] player : players) {
			Arrays.sort(player);
			for (int x : player) {
				int launches = x / 13;
				int values = x % 13;
				switch(launches) {
				case 0:
					System.out.print("黑桃");
					break;
				case 1:
					System.out.print("紅心");
					break;
				case 2:
					System.out.print("磚塊");
					break;
				case 3:
					System.out.print("梅花");
					break;
				default:
					System.out.print("Something wrong");
				}
				switch(values) {
				case 10:
					System.out.print("J ");
					break;
				case 11:
					System.out.print("Q ");
					break;
				case 12:
					System.out.print("K ");
					break;
				case 0:
					System.out.print("A ");
					break;
				default:
					System.out.print((values+1)+ " ");
				}
			}
			System.out.println();
		}
	}

}
