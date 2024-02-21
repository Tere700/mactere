package Chapter6;

public class Chicken extends Bird{
		
		public Chicken (String name) {
			super(name);
		}
		public Chicken copy() {
			return new Chicken(name);
		}
}
