package Chapter3;

public class ninNin {

	public static void main(String[] args) {

		for (int n = 1; n <= 9; n++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d =  %d\t", n,i,n*i);
				System.out.println();
			}
			System.out.printf("------\n");
		}
	}

}
