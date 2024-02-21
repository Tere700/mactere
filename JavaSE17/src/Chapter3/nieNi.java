package Chapter3;

public class nieNi {

	public static void main(String[] args) {
		int i = 0;
		while(i<9) {
			i++;
			int n = 1;
			while(n<10) {
				System.out.printf("%d x %d = %d\n", i, n, i*n);
				n++;
				System.out.println();
			}System.out.println("------");
		}
		
	}
}
