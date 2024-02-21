package Chapter6;

import java.util.HashSet;
import java.util.Set;

public class Point {

	public final int x;
	public final int y;
	public Point(int x, int y) {//建構子，初始化
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals (Object that) { //that是參數
		if(that instanceof Point) {
			Point p = (Point) that;
			//return this.x == p.x && this .y == p.y;
			return p.canEquals(this) &&
					this.x == p.x &&
					this.y == p.y;
		}
		return false;
	}
	
	public boolean canEquals(Object that) {
		return that instanceof Point;
	}
	
	@Override
	public int hashCode() {
		return 41*(41+x)+y;
	}
	public static void main(String[] args) {
		Point p1 = new Point (1,1);
		Point p2 = new Point (1,1);
		System.out.println(p1.equals(p2));;
		Set<Point> pset = new HashSet<Point>();
		pset.add(p1);
		System.out.println(pset.contains(p1));
//		p1.x = 2;
//		System.out.println(pset.contains(p1));
 	}
}
