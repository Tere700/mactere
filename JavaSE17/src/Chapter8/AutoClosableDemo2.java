package Chapter8;

public class AutoClosableDemo2 {

	public static void main(String[] args) {
		try (var some = new ResourceSome(); //可以關閉兩個以上的物件資源
			 var other = new ResourceOther()) { //越後面撰寫的物件資源會早被關閉
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}
	}
}

class ResourceSome implements AutoCloseable {

	void doSome() {
		System.out.println("做一些事情");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Some被關閉");
	}
}

class ResourceOther implements AutoCloseable {
	void doOther() {
		System.out.println("做其他事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Other被關閉");
	}
}