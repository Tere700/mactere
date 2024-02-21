package Chapter6;

public abstract class GuessNumber {
	public void go() {
		int number = (int) (Math.random() * 10);
		int guess = -1;
		do {
			System.out.println("請輸入數字：");
			guess = nextInt();
		}while(guess != number);
		System.out.println("猜中啦啦啦");
	}
//	public void println (String text) {
//		print (text + "\n");
//	}
	
	//public abstract void print(String text);
	public abstract int nextInt();	
}
