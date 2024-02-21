package Chapter7;

public interface Action {
	int STOP = 0;
	int RIGHT = 1;
	int LEFT = 2;
	int UP = 3;
	int DOWN = 4;
	void execute();
}
