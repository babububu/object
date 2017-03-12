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
	
	public int distance(Point p) {
		int d = (x - p.x)*(x - p.x) + (y - p.y)* (y - p.y) + (z - p.z)*(z - p.z);
		return d;
	}
}

public class TestPoint {
	public static void main(String[] args) {
                Point p = new Point(1,2,3);
		Point p1 = new Point(3,4,5);
		int dis = p.distance(p1);
		System.out.println(dis);
	}
}
