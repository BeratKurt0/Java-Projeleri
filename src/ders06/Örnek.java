package ders06;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Örnek {
	static Scanner scan = new Scanner(System.in);
	
	static int loop() {
		int select;
		System.out.println("1.) Sepete ürün ekle");
		System.out.println("2.) Sepetten ürün çıkar");
		System.out.println("3.) Sepete ürünü önce ekle");
		System.out.println("4.) Sepetten ürünü önce çıkar.");
		System.out.println("5.) Sepetteki ürünleri göster.");
		System.out.println("0.) Çıkış yap.\n");
		System.out.print("yukarıda bulunan seçenekleriden birini giriniz: ");
		
		while(true) {
			try {
				select = scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.print("Lütfen yukarıda gösterilen seçeneklerden birini giriniz: ");
				scan.nextLine();
				continue;
			}
			if(!(select <= 5 && select >= 0)) {
				System.out.print("Lütfen yukarıda gösterilen seçeneklerden birini giriniz: ");
				continue;
			}
			break;
		}
		return select;
	}
	
	public static void main(String[] args) {
		List list = new List();	
		String item;	
		boolean devam = true;
		
		System.out.println("Markete hoşgeldiniz...");
		System.out.println("----------------------");
		int select = loop();
		
		while(devam) {
			switch(select) {
			
			case 1,3:
				System.out.print("Eklemek istediğiniz ürünün ismini giriniz: ");
			item = scan.next();
				
				if(select == 1) {
					list.addLast(item);
				}
				else {
					list.addFirst(item);
				}
				break;
			case 2,4:
				if(select == 2) {
					list.deleteLast();
				}
				else {
					list.deleteFirst();
				}
				break;	
			case 5:
				list.print();
				break;
			case 0:
				System.out.println("Marketten çıkılıyor...");
				devam = false;
				break;
			}if(select == 0) break; 
				
			select = loop();
		}
		
		System.out.println("Sağlıklı ve iyi günler dileriz.");
		scan.close();
	}
}
