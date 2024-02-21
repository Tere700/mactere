package Chapter3;

public class ninenine {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%2d ", j, i, i * j);
			}
			System.out.println();
		}
		System.out.printf("---------------\n");
		int o = 1;
		while (o < 10) {
			int y = 2;
			while (y < 10) {
				System.out.printf("%dx%d=%2d ", y, o, y * o);
				y++;
			}
			System.out.println();
			o++;
		}
		System.out.printf("---------------\n");
		for (int u = 2, e = 1; e < 10; u = (u == 9) ? ((++e / e) + 1) : (u + 1)) {
			System.out.printf("%dx%d=%2d%c", u, e, u * e, (u == 9 ? '\n' : ' '));
		}
	}

}
