package net.ukr.andy777;

/*
 1. ������� ����������� ����� Shape � ������� ���� ��� ����������� ������ double getPerimetr()� double getArea().
 */

public abstract class Shape {
	private String color; // ���� ������� ������
	private String lineColor; // ���� ��������� ������
	private String name; // ����� ������

	public abstract double getPerimetr();

	public abstract double getArea();

	/* ����� ������������� ������ */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// ����� ��� ��������� ������� ������ �� �������
	protected double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2)
				+ Math.pow(p2.getY() - p1.getY(), 2));
	}
}
