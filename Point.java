package net.ukr.andy777;

/*
 2. Создать клас Point, в котором есть два свойства double x и double y.
 */

public class Point {
	private double x;
	private double y;

	public Point() {
		super();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	public String toString() {
		return "point[" + "x=" + x + ", y=" + y + "]";
	}

	public String toStringShort() {
		return "(" + x + "," + y + ")";
	}
}
