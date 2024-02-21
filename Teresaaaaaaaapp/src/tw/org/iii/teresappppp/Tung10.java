package tw.org.iii.teresappppp;

public class Tung10 {

	public static void main(String[] args) {
		// 邏輯運算
		int a= 10 , b = 3;
		
//		if ( a++ <= 10 && b-- >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
		//兩者為真才為真
		//第一個運算錯誤就不會繼續算第二個
		/*
		印出：
		OK：a = 11, b = 2
		 */
//		
//		if ( ++a <= 10 && --b >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
//		
		/*
		印出：
		OK：a = 12, b = 2
		 */
		
//		if ( ++a <= 10 || --b >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
		//任一為真即為真
		//第一個運算錯誤就繼續算第二個
		//第一個運算正確就不會繼續算第二個
		
		/*
		印出：
		OK：a = 13, b = 1
		 */
		
//		if ( a++ <= 10 || --b >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
		
//		if ( ++a <= 10 & --b >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
//		兩者為真才為真
//		就算第一個運算錯誤也會繼續算第二個
	
		/*
		印出：
		OK：a = 14, b = 0
		 */
//		if ( a++ <= 10 | --b >= 3) {
//			System.out.printf("OK：a = %d, b = %d\n", a, b);
//		}else {
//			System.out.printf("NO：a = %d, b = %d\n", a, b);
//		}
//		任一為真即為真
//		就算第一個運算正確也會繼續算第二個
	
		
		// 位元運算
		System.out.println(3 & 2);
		System.out.println(3 | 2);
		System.out.println(3 ^ 2);  // XOR (1和1，0和0都是false；1和0，0和1都是true)
		

	}

}