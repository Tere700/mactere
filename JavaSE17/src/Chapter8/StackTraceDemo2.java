package Chapter8;

public class StackTraceDemo2 {

	public static void main(String[] args) {
		try {
			c();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}

	static void c() {
		try {
			b();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			Throwable t = ex.fillInStackTrace();
			throw(NullPointerException) t;
			//throw ex;
		}
	}

	static void b() {
		a();
	}

	static String a() {
		String text = null;
		return text.toUpperCase();
	}

}