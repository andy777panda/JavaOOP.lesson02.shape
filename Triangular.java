package net.ukr.andy777;

/*
 3. Создать классы, которые описывают как минимум три геометрические фигуры (они должны быть подклассами Shape), 
 при этом в качестве свойств должны содержать классы Point.
 */

// клас Трикутник
public class Triangular extends Shape {
	private String name;
	private Point p1 = new Point();
	private Point p2 = new Point();
	private Point p3 = new Point();

	public Triangular() {
		super();
	}

	public Triangular(Point p1, Point p2, Point p3) {
		super();
		this.name = "triangular";
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// метод обрахунку периметру фігури (трикутника)
	@Override
	public double getPerimetr() {
		return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
	}

	// метод обрахунку площі фігури (трикутника)
	@Override
	public double getArea() {
		double halfP = this.getPerimetr() / 2;
		return Math.sqrt(halfP * (halfP - distance(p1, p2))
				* (halfP - distance(p2, p3)) * (halfP - distance(p3, p1)));
	}

	public String toString() {
		return name + " [" + p1.toStringShort() + "," + p2.toStringShort()
				+ "," + p3.toStringShort() + " - perimetr="
				+ String.format("%.6f", this.getPerimetr()) + " - area="
				+ String.format("%.6f", this.getArea()) + "]";
	}
}
