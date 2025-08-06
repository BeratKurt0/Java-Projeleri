package ders00;

public class Başlangıç {
 public static void main(String[] args) {
	// ilkel veri
	 
	 int sayi1 = 5; 
	 System.out.println("sayi1 değeri: " + sayi1);
	 
	 double sayi2 = 1.15;
	 System.out.println("sayi2 değeri: " + sayi2);
	 
	 float sayi3 = 3.19f;
	 System.out.println("sayi3 değeri: " + sayi3 + "\n");
	 
	 // basit veri
	 
	 int[] yasDeger = {175,171,165,180};
	 System.out.println("0. indis değeri: " + yasDeger[0]);
	 System.out.println("1. indis değeri: " + yasDeger[1]);
	 System.out.println("2. indis değeri: " + yasDeger[2]);
	 System.out.println("3. indis değeri: " + yasDeger[3] + "\n");
	 
	 // bileşik veri
	 
	 Arac arc1 = new Arac("Renault","Beyaz",2005);
	 Arac arc2 = new Arac("Toyota","Gri",2012);
	 
	 arc1.showInfos();
	 arc2.showInfos();
}
}

class Arac { // alt + shift + S ile Constructor method ekleyebilirsiniz.
	
	private String marka; 
	private String renk;
	private int model;
	
	// oluşturulan nesnenin değerini sonradan değiştirilmesin.
	
	public Arac(String marka, String renk, int model) {
		this.marka = marka;
		this.renk = renk;
		this.model = model;
	}
	
	public void showInfos() {
		System.out.println("----- Bilgiler -----");
		System.out.println("Marka: " + this.marka);
		System.out.println("Renk: " + this.renk);
		System.out.println("Model: " + this.model);
		System.out.println("--------------------\n");
		
	}
	
}
