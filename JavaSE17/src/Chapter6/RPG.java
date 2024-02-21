package Chapter6;

public class RPG {

	public static void main(String[] args) {
		Role role = new SwordsMan();
		var sowrdsMan2 = (SwordsMan) role;
		var swordMan = new SwordsMan();	
		swordMan.setName("Justin");
		swordMan.setLevel(1);
		swordMan.setBlood(200);
		System.out.println(swordMan.toString());
		var magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.println(magician);
//		showblood(swordMan);
//		demoSwordsman();
//		demoMagician();
//		drawFight(swordMan);
//		drawFight(magician);
	}
//	static void demoSwordsman(){
//	var swordMan = new SwordsMan();
//	swordMan.setName("Justin");
//	swordMan.setLevel(1);
//	swordMan.setBlood(200);
//	System.out.printf("劍士：(%s, %d, %d) %n", swordMan.getName(), swordMan.getLevel(),swordMan.getBlood());
//	}
//	static void demoMagician(){
//	var magician = new Magician();
//	magician.setName("Monica");
//	magician.setLevel(1);
//	magician.setBlood(100);
//	System.out.printf("魔法師：(%s, %d, %d) %n", magician.getName(), magician.getLevel(),magician.getBlood());
//	}
	static void showblood(Role role){
	System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
	}
	static void drawFight(Role role) {
		System.out.println(role.getName());
		role.fight();
	}
	
}
