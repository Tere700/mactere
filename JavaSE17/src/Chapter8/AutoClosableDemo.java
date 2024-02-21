package Chapter8;

public class AutoClosableDemo {

	public static void main(String[] args) {
		try (var res = new Resource()) {
			res.doSome();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}
	}
}

class Resource implements AutoCloseable {

	void doSome() {
		System.out.println("做一些事情");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源被關閉");
	}
}