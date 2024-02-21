package Chapter7;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish ("尼莫"));
		doSwim(new Shark ("Roy"));
		doSwim(new SwimPlayer ("Justin"));
		doSwim(new Submarine ("Yellow1"));
		doSwim(new Seaplane("空軍零號"));
		doSwim(new FlyingFish("甚平"));
		doFly(new Seaplane("飛"));
	}

	static void doSwim(Swimmer swimmer) {
		
		swimmer.swim();
		
	}
	
	static void doFly(Flyer flyer) {
		
		flyer.fly();
		
	}

}
