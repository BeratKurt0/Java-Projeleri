package ders08;


public class List extends Yazı_Şekil {
	private Node head;
	
	List(){
		head = null;
		addLast("Abdurrahman","Malkoç",20);
		addLast("Melike","Gündüz",18);
		addLast("Berkan","Mutlu",16);
		addLast("Mercan","Kaya",19);
		addLast("Kerim","Yılmaz",21);
		
	}
	
	private Node obj(String name, String surename, int age) {
		Node element = new Node(name, surename, age);
		return element;
	}
	
	void addLast(String name, String surename, int age) { // sona ekle
		if(head == null) {
			head = obj(name, surename, age);
			System.out.println(GREEN + "İlk öğrenci kaydedildi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = obj(name, surename, age);
			System.out.println(GREEN + "Öğrenci sona kaydedildi. İsim: " + LIGHT_BLUE + temp.next.name + GREEN + " Soyisim: " + LIGHT_BLUE + temp.next.surename + GREEN + " Yaş: " + LIGHT_BLUE + temp.next.age + RESET);
		}
	}
	
	void addFirst(String name, String surename, int age) { // başa ekle
		if(head == null) {
			head = obj(name, surename, age);
			System.out.println(GREEN + "İlk öğrenci kaydedildi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
		}
		else {
			Node temp = obj(name, surename, age);
			temp.next = head;
			head = temp;
			System.out.println(GREEN + "Öğrenci başa kaydedildi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
		}
	}
	
	void deleteLast() { //sondan sil
		if(head == null) {
			System.out.println(PURPLE + "Öğrenci listesi boş." + RESET);
		}
		else {
			if(head.next == null ) {
				System.out.println(GREEN + "Kalan son öğrenci silindi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
				head = null;
			}
			else {
				Node temp = head;
				while(temp.next.next != null) {
					temp = temp.next;
				}
				System.out.println(GREEN + "Sondan öğrenci silindi. İsim: " + LIGHT_BLUE + temp.next.name + GREEN + " Soyisim: " + LIGHT_BLUE + temp.next.surename + GREEN + " Yaş: " + LIGHT_BLUE + temp.next.age + RESET);
				temp.next = null;
			}
		}
	}
	
	void deleteFirst() { //baştan sil
		if(head == null) {
			System.out.println(PURPLE + "Öğrenci listesi boş." + RESET);
		}
		else {
			if(head.next == null) {
				System.out.println(GREEN + "Kalan son öğrenci silindi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
				head = null;
			}
			else {
				Node temp = head.next;
				System.out.println(GREEN + "Baştan öğrenci silindi. İsim: " + LIGHT_BLUE + head.name + GREEN + " Soyisim: " + LIGHT_BLUE + head.surename + GREEN + " Yaş: " + LIGHT_BLUE + head.age + RESET);
				head.next = null;
				head = temp;
			}
		}
	}
	
	void print() { // Öğrenci Listesi
		if(head == null) {
			System.out.println(PURPLE + " --- Öğrenci Bulunamadı --- " + RESET);
		}
		else {
			Node temp = head;
			System.out.println(YELLOW + " ----- Öğrenci Listesi ----- " + RESET);
			while(temp != null) {
				System.out.println(YELLOW + "İsim: " + LIGHT_BLUE + temp.name + YELLOW + " Soyisim: " + LIGHT_BLUE + temp.surename + YELLOW + " Yaş: " + LIGHT_BLUE + temp.age + RESET);
				temp = temp.next;
			}
			System.out.println(YELLOW + " --------------------------- " + RESET);
		}
	}
	
	private int number() { // öğrenci sayısı
		int i = 1;
		if(head == null) {
			return (i-1);
		}
		else {
			Node temp = head;
			for(;temp.next != null;i++) {
				temp = temp.next;
			}
			return i;
		}
	}
	
	void find(int index) { //öğrenci bul
		if(index < 0) {
			System.out.println(RED + "İndeks değeri negatif olmamalıdır." + RESET);
		}
		else {
			if(head == null) {
				System.out.println(PURPLE + "Öğrenci listesi boş." + RESET);
			}
			else {
				if(index < number()) {
					Node temp = head; int i = index;
					while(i != 0) {
						temp = temp.next;
						i--;
					}
					System.out.println(PURPLE + index + ". indeksteki bilgiler: " + RESET);
					System.out.println(GREEN + "İsim: " + LIGHT_BLUE + temp.name + GREEN + " Soyisim: " + LIGHT_BLUE +
							temp.surename + GREEN + " Yaş: " + LIGHT_BLUE + temp.age + RESET);
				}
				else {
					System.out.println(RED + "Belirtilen indekste öğrenci bulunmamaktadır. " + YELLOW + 
							"Öğrenci sayısı: " + LIGHT_BLUE + number() + YELLOW + " Girilen indeks: " + LIGHT_BLUE +index);
				}
			}
		}
	}

	void addBetween(int index, String name, String surename, int age) { //araya ekle
		if(index < 0) {
			System.out.println(RED + "İndeks değeri negatif olmamalıdır." + RESET);
		}
		else {
			if(index <= number()) {
				if(index == 0) {
					addFirst(name, surename, age);
				}
				else if(index == number()) {
					addLast(name, surename, age);
				}
				else {
					Node element = new Node(name, surename, age);
					Node temp1 = head, temp2; int i = index;
					while((i-1) != 0) {
						temp1 = temp1.next;
						i--;
					}
					temp2 = temp1.next;
					temp1.next = element;	element.next = temp2;
					System.out.println(PURPLE + index + ". indekse öğrenci yerleştirildi: " + RESET);
					System.out.println(GREEN + "İsim: " + LIGHT_BLUE + element.name + GREEN + " Soyisim: " + LIGHT_BLUE +
							element.surename + GREEN + " Yaş: " + LIGHT_BLUE + element.age + RESET);
				}
			}
			else {
				System.out.println(RED + "Belirtilen indekste öğrenci yerleştirilemez. " + YELLOW + 
						"Öğrenci sayısı: " + LIGHT_BLUE + number() + YELLOW + " Girilen indeks: " + LIGHT_BLUE +index);
			}
		}
	}

	void deleteBetween(int index) { //aradan sil
		if(index < 0) {
			System.out.println(RED + "İndeks değeri negatif olmamalıdır." + RESET);
		}
		else {
			if(head == null) {
				System.out.println(PURPLE + "Öğrenci listesi boş." + RESET);
			}
			else {
				if(index < number()) {
					if(index == 0) {
						deleteFirst();
					}
					else if(index == number()-1) {
						deleteLast();
					}
					else {
						Node temp1 = head, temp2;	int i = index;
						while((i-1) != 0) {
							temp1 = temp1.next;
							i--;
						}
						temp2 = temp1.next.next;
						System.out.println(PURPLE + index + ". indeksten öğrenci silindi: " + RESET);
						System.out.println(GREEN + "İsim: " + LIGHT_BLUE + temp1.next.name + GREEN + " Soyisim: " + LIGHT_BLUE +
								temp1.next.surename + GREEN + " Yaş: " + LIGHT_BLUE + temp1.next.age + RESET);
						temp1.next.next = null;
						temp1.next = temp2;
					}
				}
				else {
					System.out.println(RED + "Belirtilen indeksten öğrenci silinemez. " + YELLOW + 
							"Öğrenci sayısı: " + LIGHT_BLUE + number() + YELLOW + " Girilen indeks: " + LIGHT_BLUE +index);
				}
			}
		}
	}
}