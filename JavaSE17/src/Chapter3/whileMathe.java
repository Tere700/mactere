package Chapter3;

public class whileMathe {

	public static void main(String[] args) {
		while(true) {
			var number = (int)(Math.random()*10);
			System.out.println(number);
			
			if(number==5) {
				System.out.println("I hit 5 Orz");
				break;
			}
		}System.out.println("-------");
		var number1 = -1;
		do {
			number1 = (int)(Math.random()*10);
			System.out.println(number1);
		}while(number1!=5); 
			System.out.println("I hit 5 Orz");

	}
}
