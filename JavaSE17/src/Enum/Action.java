package Enum;

public interface Action {
	void execute();
	static void doAction() {
		System.out.println("doAction123");
	};
}
