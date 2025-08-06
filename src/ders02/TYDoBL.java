package ders02;

public class TYDoBL {
	public static void main(String[] args) {
		Liste liste = new Liste();
		
		liste.düğümEkle(0);
		liste.düğümEkle(1);
		liste.düğümEkle(2);
		
		System.out.println("1.düğümün tuttuğu veri: " + liste.head.data);
		System.out.println("2.düğümün tuttuğu veri: " + liste.head.next.data);
		System.out.println("3.düğümün tuttuğu veri: " + liste.head.next.next.data);
		System.out.println("4.düğümün tuttuğu veri: " + liste.head.next.next.next.data);
		// java.lang.NullPointerException hatası verdi (çünkü ekleme yapmadık.)
		
	}
}
