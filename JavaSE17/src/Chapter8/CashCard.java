package Chapter8;

public class CashCard {

	private String number;
	private int balance;
	private int bonus;

	CashCard(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	void store(int money) { // 儲值時呼叫的方法
		assert money>=0:"不能是負數";
		//checkMoney(money);
		this.balance += money;
		if (money >= 1000) {
			this.bonus++;
		}

	}

	void charge(int money) throws InsufficientException1 { // 扣款時呼叫的方法
		assert money>=0:"不能是負數";
		assert this.balance>=money:"🐟額不足";
		//checkMoney(money);
		//checkBalance(money);
		this.balance -= money;

	}

	private void checkMoney(int money) throws IllegalArgumentException {
		if (money < 0) {
			throw new IllegalArgumentException("扣負的,不是叫我加值嗎");
		}
	}

	private void checkBalance(int money) throws InsufficientException1  {
		if (money > this.balance) {
			throw new InsufficientException1("餘額不足", this.balance);
		}
	}

	private void checkBonus(int userBonus) throws InsufficientException1{
		if(userBonus>this.bonus) {
			throw new InsufficientException1("點數不足", this.bonus);
		}
	}
	int exchange(int bonus) throws InsufficientException1 { // 兌換紅利點數時呼叫的方法
		//checkBonus(bonus);
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
