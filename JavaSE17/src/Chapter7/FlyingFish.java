package Chapter7;

public class FlyingFish extends Fish implements Flyer{

	public FlyingFish(String name) {
		super(name);
	}


	@Override
	public void fly() {
		System.out.println("飛魚會飛");
		
	}

	@Override
	public void swim() {
		System.out.println("飛魚游泳");
		
	}

}
