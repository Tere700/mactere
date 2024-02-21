package Chapter8;

public class InsufficientException1 extends Exception {
	
	//private static final long serialVersionUID = 1L;
	
	private int remain;

	public InsufficientException1(String message, int remain) {
		super(message);
		this.remain = remain;
	}

	public int getRemain() {
		return remain;
	}
}