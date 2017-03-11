class Point {
	private int x;
	private int y;
	private int z;
	
	Point(int _x, int _y, int _z ) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(int _x) {
		x = _x;
	}
	
	public void setY(int _y) {
		y = _y;
	}
	
	public void setZ(int _z) {
		z = _z;
	}
	
	public int distance() {
		int d = x*x + y*y + z*z;
		return d;
	}
}

public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point(1,2,3);
		int dis = p.distance();
		System.out.println(dis);
	}
}