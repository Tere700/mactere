package Chapter6;

import java.util.HashSet;
import java.util.Set;

public class Point3D extends Point {

	public final int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public boolean equals(Object that) {
		if (that instanceof Point3D) {
			Point3D p = (Point3D) that;
			return super.equals(p) && this.z == p.z;
		}
//		if (that instanceof Point) { //that轉型成point
//			return that.equals(this);
//		}
		return false;
	}
	
	@Override
	public boolean canEquals(Object that) {
		return that instanceof Point3D;
	}
	
	@Override
	public int hashCode() {
		return 41 * super.hashCode() + z;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point (1,1);
		Point p3 = new Point (1,1) {
			@Override
			public String toString() {
				return "(" + x + ", " + y + ")";			}
		};
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p1);
		System.out.println(pSet.contains(p1));
		System.out.println(pSet.contains(p3));
//		Point p2 = new Point3D (1,1,1);
//		System.out.println(p1.equals(p2));;
//		System.out.println(p2.equals(p1));
 	}

}
