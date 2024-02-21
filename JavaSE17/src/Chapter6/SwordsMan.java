package Chapter6;

public class SwordsMan extends Role{
	
	@Override
	public void fight(){ //Override
		System.out.println("揮劍攻擊");
	}
	public String toString() {
		return "劍士 " + super.toString();
	}
//	public String toString() {
//		return "劍士（%s, %d, %d)".formatted(this.getName(),this.getLevel(),this.getBlood());
//	}
}
