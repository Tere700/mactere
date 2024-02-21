package Anonymous;

public class CashCardService1 {
	CashCardDAO1 cashCard;

	public CashCardService1(CashCardDAO1 cashCard) {
		this.cashCard = cashCard;
	}
	public void save(CashCard cashCard1) {
		cashCard.save(cashCard1);
	}
	
	public CashCard load(String number) {
		return cashCard.load(number);
	}
}
