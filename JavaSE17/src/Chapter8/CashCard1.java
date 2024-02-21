package Chapter8;

public class CashCard1 {

	private String number;
	private int balance;
	private int bonus;

	CashCard1(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	void store(int money) {
		negativenumber(money, "儲值是負的？你是來亂的嗎？");

		this.balance += money;
		if (money >= 1000) {
			this.bonus++;
		}
	}

	void charge(int money) {
		negativenumber(money, "扣負數？這不是叫我儲值嗎？");

		if (money <= this.balance) {
			this.balance -= money;
		} else {
			System.out.println("錢不夠啦！");
		}
	}

	void negativenumber(int money, String msg) {
		if (money < 0) {
			throw new IllegalArgumentException(msg);
		}
	}

	int exchange(int bonus) {
		negativenumber(bonus, "負的點數？想偷儲存點數啊！");

		this.bonus -= bonus;
		return this.bonus;
	}

	int getBalance() {
		return balance;
	}

	int getBonus() {
		return bonus;
	}

	String getNumber() {
		return number;
	}
}
