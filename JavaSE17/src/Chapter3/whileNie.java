package Chapter3;

public class whileNie {

	public static void main(String[] args) {
		final int COL = 8;
		final int ROW = 1;
		final int START = 2;
		int m = 0;
		while (m < COL) {
			int k = 1;
			while (k < 10) {
				int i = START;
				while (i <(START+ROW)){
					int newi = i + (m * ROW);
					int r = newi * k;
					System.out.printf("%d x %d = %d\t", newi, k, r);
					i++;
				}
				k++;
				System.out.println();
			}m++;
			System.out.println("-----");
		}
	}

}
