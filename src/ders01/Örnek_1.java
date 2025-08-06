package ders01;

public class Örnek_1 {
	public static void main(String[] args) {
		Reel reel=new Reel(1,6.5,3.14159);
		Rasyonel rasyonel=new Rasyonel(8,7.49);
		Tam tam=new Tam(4);
		//nesneler oluşturuldu.
		reel.next=rasyonel;
		rasyonel.next=tam;
		//referanslara bağlama işlemi yapıldı !
		
		
		//göstericiler, bir java projesi içerisinde genelde:
		// paket_ismi.class_ismi@bellek_numarası<-- şeklinde bulunur. 
		
		System.out.println("Reel Sayılar Nesnesinin  ref. değeri: "+reel);
		System.out.println("Rasyonel Sayılar Nesnesinin  ref. değeri: "+rasyonel);		
		System.out.println("Tam Sayılar Nesnesinin  ref. değeri: "+tam);	
		System.out.println("--------------------------------------------");
		
		System.out.println("Reel Sayılar Nesnesinin içindeki değer(kendi referansı ile): "+reel.sayı1);
		System.out.println("Rasyonel Sayılar Nesnesinin içindeki değer(kendi referansı ile): "+rasyonel.sayı1);
		System.out.println("Tam Sayılar Nesnesinin içindeki değer(kendi referansı ile): "+tam.sayı1);
		System.out.println("--------------------------------------------");

		System.out.println("Rasyonel Sayılar Nesnesinin içindeki değer(Reel Sayı referansı ile): "+reel.next.sayı2);
		System.out.println("Tam Sayılar Nesnesinin içindeki değer(Reel Sayı referansı ile): "+reel.next.next.sayı1);
		System.out.println("Tam Sayılar Nesnesinin içindeki değer(Rasyonel Sayı referansı ile): "+rasyonel.next.sayı1);

		
		//tüm olası değerler yazıldı.
		
		/* Java da gösterici hatası:
		 * düğümleri birbirine bağlamayı unutursak
		 * java bize şu hatayı verir: 
		 * "java.lang.NullPointerException" 
		 */
		
	}
}

class Reel extends Rasyonel{
	double sayı3;
	Rasyonel next;
	public Reel(int sayı1, double sayı2, double sayı3) {
		super(sayı1, sayı2);
		this.sayı3 = sayı3;
		next=null;
	}
	
}

class Rasyonel extends Tam{
	
	double sayı2;
	Tam next;
	public Rasyonel(int sayı1, double sayı2) {
		super(sayı1);
		this.sayı2 = sayı2;
		next=null;
	}
	
}

class Tam{
	int sayı1;
	
	 Tam(int sayı1) {
		this.sayı1=sayı1;
		
	}
}
