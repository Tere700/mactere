package Chapter7;

public class Some implements Action{

	public static void main(String[] args) {
		Action action = new Some();
		action.execute();

	}

	@Override
	public void execute() {
		System.out.println("do something");
		
	}

}
