package Chapter7;

public class Seaplane extends Airplane implements Swimmer{
	
	public Seaplane(String name) {
		super(name
				);
	}

	
	@Override
	public void fly() {
		System.out.printf("海上");
		super.fly();
	}

	@Override
	public void swim() {
		System.out.printf("海上飛機 %s 航行海面%n", this.name);
		
	}

}
