package Chapter4;

import java.util.Scanner;

public class examPle {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		CashCard[] cards = { new examPle.CashCard("A001", 500, 0), new examPle.CashCard("A002", 300, 0),
				new examPle.CashCard("A003", 1000, 1), new examPle.CashCard("A004", 2000, 2),
				new examPle.CashCard("A005", 3000, 3) };
		cards[0].store(1000);
		for (CashCard i : cards) {
			System.out.printf("為(%s,%d,%d) 儲值：", i.number, i.balance, i.bonus);
			i.store(scan.nextInt());
			System.out.printf("明細 %s,%d,%d %n", i.number, i.balance, i.bonus);
		}
	}

	static class CashCard {
		String number;
		int balance;
		int bonus;

		CashCard(String number, int balance, int bonus) {
			this.number = number;
			this.balance = balance;
			this.bonus = bonus;
		}

		void store(int money) {
			if (money > 0) {
				this.balance += money;
				if (money >= 1000) {
					this.bonus++;
				}
			} else {
				System.out.println("ArYuKidding");
			}
		}

		void charge(int money) {
			if (money > 0) {
				if (money <= this.balance) {
					this.balance -= money;
				} else {
					System.out.println("錢不夠啦");
				}
			} else {
				System.out.println("扣負數？");
			}
		}
		int exchange(int bonus) {
			if(bonus>0) {
				this.bonus+=bonus;
			}return this.bonus;
		}
	}
}
