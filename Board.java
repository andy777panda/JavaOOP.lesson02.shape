package net.ukr.andy777;

/*
 4. Создать класс доска. Доска поделена на 4 части, в каждую часть доски можно положить одну из фигур.
 У доски должны быть методы, которые помещают и удаляют фигуру с доски.
 Также должен быть метод, который выводит информацию о всех фигурах лежащих на доске и их сумарную площадь.
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

	// метод кладе фігуру sp у квадрант i дошки
	public void putFigureOnBoard(Shape sp, int i) {
		System.out.println("Метод кладе фігуру "+sp.getName()+" на "+i+"-й квадрант дошки");
		if (i >= 1 && i <= 4) {
			this.figures[i - 1] = sp;
			System.out.println(toString());
		} else {
			System.out.println("((( квадрант " + i + " відсутній на дошці \n");
		}
	}

	// метод прибирає фігуру з квадранту i дошки
	public void removeFigureFromBoard(int i) {
		System.out.println("Метод прибирає фігуру з "+i+"-го квадранта дошки");
		if (i >= 1 && i <= 4) {
			this.figures[i - 1] = null;
			System.out.println(toString());
		} else {
			System.out.println("((( квадрант " + i + " відсутній на дошці \n");
		}
	}

	public String toString() {
		double sumArea = 0;
		int i = 0;
		String res = "";
		for (Shape sp : figures) {
			i++; // нумератор квадрантів з 1го
			if (sp != null) {
				res += i + "." + sp.getName() + "\t";
				sumArea += sp.getArea();
			} else {
				res += i + ".ПУСТИЙ" + "\t";
			}
		}
		res += "сумарна площа фігур = " + String.format("%.6f", sumArea) + "\n";
		return res;
	}
}