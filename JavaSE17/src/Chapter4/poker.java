package Chapter4;

import java.util.Arrays;

public class poker {

	public static void main(String[] args) {
		int nums = 52;
		int[] poker = new int[nums];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;
		for (int i = nums - 1; i > 0; i--) {
			int temp;
			int rand = (int) (Math.random() * (i + 1));
			temp = poker[i];
			poker[i] = poker[rand];
			poker[rand] = temp;
		}
//		for (int x : poker) {
//			System.out.println(x);
//		}
		int [][] players = new int [4][13];
		for (int i = 0; i < poker.length; i++) {
			players[i%4][i/4]=poker[i];
		}
		for (int[] player : players) {
			Arrays.sort(player);
		    for (int m : player) {
		        int launches = m / 13;
		        int values = m % 13;

		        switch (launches) {
		            case 0:
		                System.out.print("黑桃 ");
		                break;
		            case 1:
		                System.out.print("紅心 ");
		                break;
		            case 2:
		                System.out.print("方塊 ");
		                break;
		            case 3:
		                System.out.print("梅花 ");
		                break;
		            default:
		                System.out.print("something wrong ");
		        }

		        switch (values) {
		            case 0:
		                System.out.print("A ");
		                break;
		            case 10:
		                System.out.print("J ");
		                break;
		            case 11:
		                System.out.print("Q ");
		                break;
		            case 12:
		                System.out.print("K ");
		                break;
		            default:
		                System.out.print((values + 1) + " ");
		        }
		    }
		    System.out.println(); // 換行，表示下一個玩家的牌
		}
	
	}

}
