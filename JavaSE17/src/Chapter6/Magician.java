package Chapter6;

public class Magician extends Role{
		public void fight() {	
		System.out.println("魔法攻擊" );
	}
		public void cure() {	
			System.out.println("魔法治癒");
		}
		public String toString() {
			return "魔法師 " + super.toString();
		}
//		public String toString() {
//			return "魔法師".formatted(this.name,this.level,this.blood);
//		}

}
