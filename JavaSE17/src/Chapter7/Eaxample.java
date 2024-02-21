package Chapter7;

public class Eaxample {
	public static void main(String[] args) {
		Swimmer swimmer1 = new Shark("Tera1");
		Swimmer swimmer3 = new Submarine("Tera3");
		Shark shark = (Shark) swimmer1;
		var fish = (Fish)swimmer1;
		
	}
}