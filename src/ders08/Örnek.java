package ders08;

public class Örnek extends Yazı_Şekil {
		
	static int loop() {
		int select;
		System.out.println(YELLOW + "1.) Sona öğrenci ekle");
		System.out.println("2.) Başa öğrenci ekle");
		System.out.println("3.) Sondan öğrenci sil");
		System.out.println("4.) Baştan öğrenci sil");
		System.out.println("5.) Aradan Öğrenci ekle");
		System.out.println("6.) Aradan Öğrenci sil");
		System.out.println("7.) Öğrenciyi bul");
		System.out.println("8.) Listeyi göster");
		System.out.println("0.) Çıkış yap\n");
		System.out.print("Yukarıdaki seçeneklerden birini seçiniz: " + LIGHT_BLUE);
		
		while(true) {
			select = Index();
			if(!(select >=0 && select <= 8)) {
				System.out.print(RED + "Lütfen yukarıda gösterilen seçeneklerden birini giriniz : " + LIGHT_BLUE);
				continue;
			}
			break;
		}
		return select;
	}
	
	public static void main(String[] args) {
		int select;	Boolean devam = true;
		List list = new List();
		System.out.println(YELLOW + " ----- Hoşgeldiniz -----\n" + RESET);
		
		select = loop();
		
		while(devam) {
			switch(select) {
			case 1,2,5:
				String name, surename;	int age;
				
				System.out.print(BLUE + "İsmi giriniz: " + LIGHT_BLUE);	name = scan.next();
				
				System.out.print(BLUE + "Soyismi giriniz: " + LIGHT_BLUE);	surename = scan.next();
				
				System.out.print(BLUE + "Yaş giriniz: " + LIGHT_BLUE);
				while(true) {
					age = Index();
					if(age < 0) {
						System.out.print(RED + "Lütfen program açıklarını yakalamaya çalışmayınız :)  : " + LIGHT_BLUE);
						continue;
					}
					else if(age < 15) {
						System.out.println(RED + "Kayıt için Öğrenci en az 15 yaşında olmalıdır.");
						break;
					}
					else {
						break;
					}
				}
				
				if(age < 15) break;
					
				if(select == 1) 	list.addLast(name, surename, age);
					
				else if(select == 2) list.addFirst(name, surename, age);
					
				else if(select == 5) {
					int index;
					System.out.print(BLUE + "İndeks değerini giriniz: " + LIGHT_BLUE);
					index = Index();
					list.addBetween(index, name, surename, age);
				}
				
				break;
			
			case 3,4,6,7:
				if(select == 3) 	list.deleteLast();
					
				else if(select == 4) list.deleteFirst();
				
				else {
					System.out.print(BLUE + "İndeks değerini giriniz: " + LIGHT_BLUE);
					int index = Index();
					if(select == 6) {
						list.deleteBetween(index);
					}
					else {
						list.find(index);
					}
				}
				break;
			
			case 8:
				list.print();
				break;
			case 0:
				devam = false;
				break;
			}
			if(select != 0) {
				select = loop();
			}
			else {
				System.out.println("Sağlıklı ve iyi günler dileriz.");
			}
		}
		scan.close();
	}
}
