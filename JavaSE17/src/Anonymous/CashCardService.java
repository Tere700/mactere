package Anonymous;

public class CashCardService {
	private CashCardDAO cashCardDao;
	
	public CashCardService(CashCardDAO cashCardDao) {
		this.cashCardDao = cashCardDao;
	}
	
	public void save(CashCard cashCard) {
		cashCardDao.save(cashCard);
	}

	public CashCard load(String number) {
		return cashCardDao.load(number);
		
	}
	
}
