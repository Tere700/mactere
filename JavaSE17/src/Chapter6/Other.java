package Chapter6;

public class Other extends Some{

//	private int x;
	Other(){
//		super(); // 顯式地呼叫父類別的有參數建構子
//        this.x = 10;
		System.out.println("呼叫Other()");
	}
//	Other(int x){
//		super(x);
//		this.x = x;
//	}
	public static void main(String[] args) {
		Other o = new Other();
		System.out.println(o);
	}
}
