package net.ukr.andy777;

/*
1. Создать абстрактный класс Shape в котором есть два абстрактных метода double getPerimetr()и double getArea().
2. Создать клас Point, в котором есть два свойства double x и double y.
3. Создать классы, которые описывают как минимум три геометрические фигуры (они должны быть подклассами Shape), 
при этом в качестве свойств должны содержать классы Point.
4. Создать класс доска. Доска поделена на 4 части, в каждую часть доски можно положить одну из фигур.
У доски должны быть методы, которые помещают и удаляют фигуру с доски.
Также должен быть метод, который выводит информацию о всех фигурах лежащих на доске и их сумарную площадь.
5. Нарисовать UML диаграмму проекта. 
*/

public class Main {

	public static void main(String[] args) {

		// ініціалізація 4х точок
		Point p1 = new Point(0, 0);
		Point p2 = new Point(7, 0);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(0, 7);

		// ініціалізація трикутника
		Triangular tr = new Triangular(p1, p2, p3);
		System.out.println(tr);

		// ініціалізація чотирикутника
		Quadrangle qd = new Quadrangle(p1, p2, p3, p4);
		System.out.println(qd);

		// ініціалізація кола
		Circle cl = new Circle(p1, p2);
		System.out.println(cl);

		System.out.println();

		// ініціалізація дошки
		Board bd = new Board();
		// розміщення на... та прибирання фігур з... дошки
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