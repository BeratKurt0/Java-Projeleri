package ders10;

public class Ortadan_Ekle_Çıkar {
	public static void main(String[] args) {
		List list =new List();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		list.addBetween(2, 25); // 10, 20, "25", 30, 40, 50
		
		list.print();
		
		list.deleteBetween(3); // 10, 20, 25, 40, 50 ("30" silindi.)
		
		list.print();
	}
}
