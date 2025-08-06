package ders04;

public class Düğüm_Silme {
	public static void main(String[] args) {
		List list = new List();
		list.addLast(0);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
		list.deleteLast();
		list.print();
	}
}
