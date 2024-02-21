package Enum;

public class Service implements Some, Other{

	public static void main(String[] args) {
		Action.doAction();

	}
	

	@Override
	public void doOther() {
		System.out.println("doOther()");
		
	}

	@Override
	public void execute() {
		System.out.println("execute()");
		
	}

	@Override
	public void doSome() {
		System.out.println("doSome()");
		
	}

}
