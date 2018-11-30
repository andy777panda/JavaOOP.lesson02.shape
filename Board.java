package net.ukr.andy777;

/*
 4. ������� ����� �����. ����� �������� �� 4 �����, � ������ ����� ����� ����� �������� ���� �� �����.
 � ����� ������ ���� ������, ������� �������� � ������� ������ � �����.
 ����� ������ ���� �����, ������� ������� ���������� � ���� ������� ������� �� ����� � �� �������� �������.
 */

public class Board {
	private Shape[] figures = new Shape[4];

	public Board() {
		super();
	}

	public Board(Shape[] figures) {
		super();
		this.figures = figures;
	}

	// ����� ����� ������ sp � �������� i �����
	public void putFigureOnBoard(Shape sp, int i) {
		System.out.println("����� ����� ������ "+sp.getName()+" �� "+i+"-� �������� �����");
		if (i >= 1 && i <= 4) {
			this.figures[i - 1] = sp;
			System.out.println(toString());
		} else {
			System.out.println("((( �������� " + i + " ������� �� ����� \n");
		}
	}

	// ����� ������� ������ � ��������� i �����
	public void removeFigureFromBoard(int i) {
		System.out.println("����� ������� ������ � "+i+"-�� ��������� �����");
		if (i >= 1 && i <= 4) {
			this.figures[i - 1] = null;
			System.out.println(toString());
		} else {
			System.out.println("((( �������� " + i + " ������� �� ����� \n");
		}
	}

	public String toString() {
		double sumArea = 0;
		int i = 0;
		String res = "";
		for (Shape sp : figures) {
			i++; // ��������� ��������� � 1��
			if (sp != null) {
				res += i + "." + sp.getName() + "\t";
				sumArea += sp.getArea();
			} else {
				res += i + ".������" + "\t";
			}
		}
		res += "������� ����� ����� = " + String.format("%.6f", sumArea) + "\n";
		return res;
	}
}
