package Chapter7;

public class Do {
	static void doSwimmer(Swimmer swimmer) {
		swimmer.swim();
	}
	public static void main(String[] args) {
		doSwimmer(new Shark("鯊魚"));
		doSwimmer(new Human("人類"));
		Fish a = new Shark("a");
		System.out.println(a.name);
		Shark s =(Shark) a ;
		System.out.println(s.name);
	}

}
