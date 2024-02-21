package Chapter7;

public class Helicopter extends Airplane{

	public Helicopter(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.printf("飛機 %s 在飛%n", name);
	}
	public static void main(String[] args) {
	Helicopter h = new Helicopter("直升機");
	h.fly();
	}
}
