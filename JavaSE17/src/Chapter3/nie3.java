package Chapter3;

public class nie3 {

	public static void main(String[] args) {
		final int COL = 5;
		final int ROW = 7;
		final int START = 1;
		for (int k = 0; k < COL; k++) {
			for (int n = 1; n <= 9; n++) {
				for (int i = START; i <= ROW; i++) {
					int newi = i + (k * ROW);
					int r = n * newi;
					if (newi != n) {
						System.out.printf("%d x %d = %d\t", newi, n, r);
					}else {
						System.out.printf("%d x %d = %.1f\t", newi, n, r*0.1);
					}
				}
				System.out.println();
			}
			System.out.println("-----");
		}
	}
}
