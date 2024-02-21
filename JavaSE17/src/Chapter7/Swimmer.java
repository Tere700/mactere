package Chapter7;

public interface Swimmer {
	public abstract void swim();

 public static void main(String[]args){
	 Swimmer swimmer = new Shark(" ");
	 Piranha fish = (Piranha)swimmer;	 
	 fish.swim();
 }
}