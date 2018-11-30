package net.ukr.andy777;

/*
 3. ������� ������, ������� ��������� ��� ������� ��� �������������� ������ (��� ������ ���� ����������� Shape), 
 ��� ���� � �������� ������� ������ ��������� ������ Point.
 */

// ���� ������������
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

	// ����� ��������� ��������� ������ (�������������)
	@Override
	public double getPerimetr() {
		return distance(p1, p2) + distance(p2, p3) + distance(p3, p4)
				+ distance(p4, p1);
	}

	// ����� ��������� ����� ������ (�������������)
	@Override
	public double getArea() {

		// ������������ �� ����������
		tr[0] = new Triangular(p1, p2, p3);
		tr[1] = new Triangular(p1, p4, p2);
		tr[2] = new Triangular(p2, p4, p3);
		tr[3] = new Triangular(p1, p4, p3);

		/*
		 * ���������� ����� 4-������� ����� ����� ���������� p1p2p3 �� p1p4p3:
		 * 1)���������� ���� ����������� ����� p4 (�/���� ���������� p1p2p3).
		 * 1.1)���� ����� ���������� p1p2p3 ������� ����� ����� ���������� �
		 * �������� p4, �� ����� p4 ����������� � ���������� p1p2p3
		 */
		if (tr[0].getArea() == tr[1].getArea() + tr[2].getArea()
				+ tr[3].getArea()) {
			// 2.1)���� p4 � ����������, �� ����� 4-������� = ������ ����
			// ����������
			return tr[0].getArea() - tr[3].getArea();
		} else {
			// 2.2)���� p4 ���� �����������, �� ����� 4-������� = ��� ����
			// ����������
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
