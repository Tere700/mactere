package Chapter7;

public class Submarine extends Boat implements Dive{
	private String name;
	
	public Submarine(String name) {
		super(name);
	}

	@Override
	public void dive() {
		System.out.printf("潛水艇 %s 潛行%n", name);
		
	}
}
