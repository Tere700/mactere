package Chapter6;

public class Powee {

	public static void main(String[] args) {
		int START = 1;
		int COL = 4;
		int ROW = 3;
		for (int n = 0; n < ROW; n++) {
			for (int j = 1; j < 10; j++) {
				for (int i = START; i <= (START + ROW); i++) {
					int newi = i + (n * COL);
					int r = j * newi;
					System.out.printf("%d x %d = %2d \t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
