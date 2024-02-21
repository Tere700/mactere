package Chapter5;

public abstract class GuessGame1 {
	public void go() {
		var number = (int)(Math.random()*10);
		var guess = -1;
		do {
			System.out.print("請輸入數字：");
			guess = nextInt();
		}while(guess!=number);
		System.out.println("猜中了");
	}
	public abstract void print(String text);
	public abstract int nextInt();
	

}
