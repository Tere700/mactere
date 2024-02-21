package Chapter6;

public class RPG1 {
	public void demoSwordsman(){
	var swordMan = new SwordsMan();
	swordMan.setName("Justin");
	swordMan.setLevel(1);
	swordMan.setBlood(200);
	System.out.printf("劍士：(%s, %d, %d) %n", swordMan.getName(), swordMan.getLevel(),swordMan.getBlood());
	}
	public  void demoMagician(){
	var magician = new Magician();
	magician.setName("Monica");
	magician.setLevel(1);
	magician.setBlood(100);
	System.out.printf("魔法師：(%s, %d, %d) %n", magician.getName(), magician.getLevel(),magician.getBlood());
	}
	public static void main(String[] args) {
		RPG1 rpg = new RPG1();
		rpg.demoMagician();
		
		
		
	}
}
