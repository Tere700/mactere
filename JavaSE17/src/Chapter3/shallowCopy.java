package Chapter3;

class Clothes {
	String color;
	char size;
	Clothes(String color, char size) {
		this.color = color;
		this.size = size;
	}
	
}

public class shallowCopy {

	public static void main(String[] args) {
		Clothes[] c1 = {new Clothes("red", 'L'), new Clothes ("yellow", 'M')};
		Clothes[] c2 = new Clothes [c1.length];
		for (int i = 0; i < c1.length; i++) {
			//c2[i] = c1[i];
			c2[i]= new Clothes(c1[i].color, c1[i].size);
		}
		c1[0].color = "blue";
		System.out.println(c2[0].color);
//		for (var b : c2) {
//		    System.out.printf("Color: %s, Size: %c\n", b.color, b.size);
//		}
	}
}
