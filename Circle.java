package net.ukr.andy777;

/*
 3. Создать классы, которые описывают как минимум три геометрические фигуры (они должны быть подклассами Shape), 
 при этом в качестве свойств должны содержать классы Point.
 */

// клас Коло
public class Circle extends Shape {
	private String name;
	private Point p1 = new Point();
	private Point p2 = new Point();

	public Circle() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Circle(Point p1, Point p2) {
		super();
		this.name = "circle";
		this.p1 = p1;
		this.p2 = p2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// метод обрахунку периметру фігури (кола)
	@Override
	public double getPerimetr() {
		return Math.PI * 2 * distance(p1, p2);
	}

	// метод обрахунку площі фігури (кола)
	@Override
	public double getArea() {
		return Math.PI * Math.pow(distance(p1, p2), 2);
	}

	public String toString() {
		return name + " [" + p1.toStringShort() + "," + p2.toStringShort()
				+ " - perimetr=" + String.format("%.6f", this.getPerimetr())
				+ " - area=" + String.format("%.6f", this.getArea()) + "]";
	}
}
