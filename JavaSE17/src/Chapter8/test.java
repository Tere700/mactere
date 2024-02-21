package Chapter8;

import java.io.IOException;

import Chapter4.cashCard;

public class test {

	public static void main(String[] args) throws InsufficientException1  {
		CashCard c = new CashCard("1", 500, 1);

		c.charge(-300);

			System.out.println(c.getBalance());

	}

}
