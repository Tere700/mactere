package iii.brad.tw;

public class StackTraceDemo {
	public static void main(String[] argsÎÏ) {
		try {
			c();
		} catch (NullPointerException ex) {
			Throwable t = ex.fillInStackTrace();
			throw (NullPointerException)t;
		}
	}

	static void c() {
		b();
	}

	static void b() {
		a();
	}

	static String a() {
		String text = null;
		return text.toUpperCase();
	}
}
