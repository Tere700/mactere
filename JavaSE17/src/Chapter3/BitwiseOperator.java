package Chapter3;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a =45; System.out.println(a); //補數
		a =~a;System.out.println(a);
//		
//		System.out.println(~3);
//		System.out.printf("%6.2f",0.3);
		
		System.out.println("AND 運算："); //兩個都是1才是1
		System.out.printf("0 AND 0 %5d%n", 0 & 0); //5d中的5是字符的寬度
		System.out.printf("0 AND 1 %5d%n", 0 & 1);
		System.out.printf("1 AND 0 %5d%n", 1 & 0);
		System.out.printf("1 AND 1 %5d%n", 1 & 1);
		
		System.out.println("\nOR 運算："); //只要一個是1就是1
		System.out.printf("0 OR 0 %6d%n", 0 | 0); //5d中的5是字符的寬度
		System.out.printf("0 OR 1 %6d%n", 0 | 1);
		System.out.printf("1 OR 0 %6d%n", 1 | 0);
		System.out.printf("1 OR 1 %6d%n", 1 | 1);
		
		System.out.println("\nXOR 運算："); //位元不同就是1
		System.out.printf("0 XOR 0 %5d%n", 0 ^ 0); //5d中的5是字符的寬度
		System.out.printf("0 XOR 1 %5d%n", 0 ^ 1);
		System.out.printf("1 XOR 0 %5d%n", 1 ^ 0);
		System.out.printf("1 XOR 1 %5d%n", 1 ^ 1);

	}

}
