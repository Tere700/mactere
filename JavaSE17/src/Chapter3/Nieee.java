package Chapter3;

public class Nieee {

	public static void main(String[] args) {
		final int COL =4;
		final int ROW =3;
		final int START = 5;
		for(int k=0;k<ROW;k++) {
			for(int j=1;j<=9;j++) {
				for(int i=START;i<=(START+COL-1);i++) {
			int x = i+k*COL;
			int r = x*j;
			System.out.printf("%d X %d = %d\t",x,j,r);	
		}
				System.out.println();
		}
			System.out.println("----------------------------");
		}

	}

}
