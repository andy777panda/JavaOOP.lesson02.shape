package net.ukr.andy777;

/*
1. ������� ����������� ����� Shape � ������� ���� ��� ����������� ������ double getPerimetr()� double getArea().
2. ������� ���� Point, � ������� ���� ��� �������� double x � double y.
3. ������� ������, ������� ��������� ��� ������� ��� �������������� ������ (��� ������ ���� ����������� Shape), 
��� ���� � �������� ������� ������ ��������� ������ Point.
4. ������� ����� �����. ����� �������� �� 4 �����, � ������ ����� ����� ����� �������� ���� �� �����.
� ����� ������ ���� ������, ������� �������� � ������� ������ � �����.
����� ������ ���� �����, ������� ������� ���������� � ���� ������� ������� �� ����� � �� �������� �������.
5. ���������� UML ��������� �������. 
*/

public class Main {

	public static void main(String[] args) {

		// ����������� 4� �����
		Point p1 = new Point(0, 0);
		Point p2 = new Point(7, 0);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(0, 7);

		// ����������� ����������
		Triangular tr = new Triangular(p1, p2, p3);
		System.out.println(tr);

		// ����������� �������������
		Quadrangle qd = new Quadrangle(p1, p2, p3, p4);
		System.out.println(qd);

		// ����������� ����
		Circle cl = new Circle(p1, p2);
		System.out.println(cl);

		System.out.println();

		// ����������� �����
		Board bd = new Board();
		// ��������� ��... �� ���������� ����� �... �����
		bd.putFigureOnBoard(tr, 5);
		bd.putFigureOnBoard(qd, 2);
		bd.putFigureOnBoard(cl, 3);
		bd.removeFigureFromBoard(3);
		bd.putFigureOnBoard(tr, 3);
		bd.putFigureOnBoard(cl, 4);
		bd.removeFigureFromBoard(6);
		bd.removeFigureFromBoard(1);
	}
}