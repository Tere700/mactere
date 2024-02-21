package Anonymous;

public interface CashCardDAO {

	public void save(CashCard cashCard);

	public CashCard load(String number);
}
