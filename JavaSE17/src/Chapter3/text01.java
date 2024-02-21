package Chapter3;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class text01 {

	public static void main(String[] args) {
		int data1 = 10;
		int data2 = 0;
		var wrapper1 = Integer.valueOf(data1);
		var wrapper2 = Integer.valueOf(data2);
		System.out.println(data1/3);
		System.out.println(wrapper1.compareTo(wrapper2));

	}

}
