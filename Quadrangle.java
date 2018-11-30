package net.ukr.andy777;

/*
 3. —оздать классы, которые описывают как минимум три геометрические фигуры (они должны быть подклассами Shape), 
 при этом в качестве свойств должны содержать классы Point.
 */

// клас „отирикутник
public class Quadrangle extends Shape {
	private String name;
	private Point p1 = new Point();
	private Point p2 = new Point();
	private Point p3 = new Point();
	private Point p4 = new Point();
	private Triangular[] tr = new Triangular[4];

	public Quadrangle() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.name = "quadrangle";
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// метод обрахунку периметру ф≥гури (чотирикутника)
	@Override
	public double getPerimetr() {
		return distance(p1, p2) + distance(p2, p3) + distance(p3, p4)
				+ distance(p4, p1);
	}

	// метод обрахунку площ≥ ф≥гури (чотирикутника)
	@Override
	public double getArea() {

		// декомпозиц≥€ на трикутники
		tr[0] = new Triangular(p1, p2, p3);
		tr[1] = new Triangular(p1, p4, p2);
		tr[2] = new Triangular(p2, p4, p3);
		tr[3] = new Triangular(p1, p4, p3);

		/*
		 * ¬изначенн€ площ≥ 4-кутника через площу трикутник≥в p1p2p3 та p1p4p3:
		 * 1)визначенн€ м≥сц€ знаходженн€ точки p4 (в/поза трикутника p1p2p3).
		 * 1.1)якщо площа трикутника p1p2p3 дор≥внюЇ площ≥ трьох трикутник≥в з
		 * вершиною p4, то точка p4 знаходитьс€ в трикутнику p1p2p3
		 */
		if (tr[0].getArea() == tr[1].getArea() + tr[2].getArea()
				+ tr[3].getArea()) {
			// 2.1)€кщо p4 в трикутнику, то площа 4-кутника = р≥зниц≥ площ
			// трикутник≥в
			return tr[0].getArea() - tr[3].getArea();
		} else {
			// 2.2)€кщо p4 поза трикутником, то площа 4-кутника = сум≥ площ
			// трикутник≥в
			return tr[0].getArea() + tr[3].getArea();
		}
	}

	public String toString() {
		return name + " [" + p1.toStringShort() + "," + p2.toStringShort()
				+ "," + p3.toStringShort() + "," + p4.toStringShort()
				+ " - perimetr=" + String.format("%.6f", this.getPerimetr())
				+ " - area=" + String.format("%.6f", this.getArea()) + "]";
	}
}
