package Chapter8;

public class CashCard3 {

	private String number;
	private int balance;
	private int bonus;

	CashCard3(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	void store(int money) {
		assert money >=0 : "儲值是負的？你是來亂的嗎？";
		
		this.balance += money;
		processbonus(money);
	}
	
	void processbonus(int money) {
		if(money>=1000) {
			this.bonus++;
		}
	}

	void charge(int money) throws InsufficientException1 {
		assert money >=0 : "扣負數？這不是叫我儲值嗎？";
		
		checkBalance(money);
		this.balance -= money;
	}

	void negativenumber(int money, String msg) {
		if (money < 0) {
			throw new IllegalArgumentException(msg);
		}
	}
	
	private void checkBalance(int money)throws InsufficientException1{
		if(money>this.balance) {
			throw new InsufficientException1("錢不夠啦", this.balance);
		}
	}

	int exchange(int bonus) throws InsufficientException1 {
		assert bonus >=0 : "負的點數？想偷儲存點數啊！";
		
		checkBonus(bonus);
		this.bonus -= bonus;
		return this.bonus;
	}
	
	private void checkBonus(int bonus)throws InsufficientException1{
		if(bonus>this.bonus) {
			throw new InsufficientException1("點數不夠啦", this.bonus);
		}
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
