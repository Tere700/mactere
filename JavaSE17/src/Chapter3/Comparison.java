package Chapter3;

public class Comparison {

	public static void main(String[] args) {
		System.out.printf("10 > 5 結果 %b%n", 10 > 5);
		System.out.printf("10 >= 5 結果 %b%n", 10 >= 5);
		System.out.printf("10 < 5 結果 %b%n", 10 < 5);
		System.out.printf("10 <= 5 結果 %b%n", 10 <= 5);
		System.out.printf("10 == 5 結果 %b%n", 10 == 5);
		System.out.printf("10 != 5 結果 %b%n", 10 != 5);
	//條件式?成立回傳值:失敗回傳值
		int x = 10;
		int y = 20;
		int max = (x > y) ? x : y;
		System.out.println("Max Value:" + max);
		int number = 5;
		String result = (number>0)? "Positive" : "Non-positive";
		System.out.println("Result:" + result);
	}
}
