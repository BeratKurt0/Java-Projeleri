package ders05;

public class Başa_Ekle_Sil {
	public static void main(String[] args) {
		List list = new List();
		list.addLast(0);
		list.addLast(1);
		list.addLast(2);
		
		list.print();
		
		list.addFirst(-1);
		list.addFirst(-2);
		list.addFirst(-3);
		
		list.print();
		/*
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		*/
		
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		list.deleteFirst();
		list.print();
		
	}
}
