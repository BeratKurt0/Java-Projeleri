package ders07;

public class List {
	private Node head;
	
	List(){
		head = null;
	}
	
	private Node obj(int data) {
		Node element = new Node(data);
		return element;
	}
	
	void addLast(int data) {
		if(head == null) {
			head = obj(data);
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi !");
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = obj(data);
			System.out.println("Düğüm eklendi !");
		}
	}
	
	void addFirst(int data) {
		if(head == null) {
			head = obj(data);
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi !");
		}
		else {
			Node temp = obj(data);
			temp.next = head;
			head = temp ;
			System.out.println("Başa düğüm eklendi !");
		}
	}
	
	void deleteLast() {
		if(head == null) {
			System.out.println("Liste boş. Düğüm silinemiyor.");
		}
		else {
			if(head.next == null) {
				head = null;
				System.out.println("Kalan son düğüm de silindi !");
			}
			else {
				Node temp = head;
				while(temp.next.next != null) {
					temp = temp.next;
				}
				temp.next = null;
				System.out.println("Sondan düğüm silindi !");
			}
		}
	}
	
	void deleteFirst() {
		if(head == null) {
			System.out.println("Liste boş. Düğüm silinemiyor.");
		}
		else {
			if(head.next == null) {
				head = null;
				System.out.println("Kalan son düğüm de silindi !");
			}
			else {
				Node temp = head.next;
				head.next = null;
				head = temp;
				System.out.println("Baştan düğüm silindi !");
			}
		}
	}
	
	void print() {
		if(head == null) {
			System.out.println("----- Liste Boş -----");
		}
		else {
			Node temp = head;
			System.out.println("---- Liste ----");
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println("---------------");
		}
	}
	
	//------------//
	
	private int number() {	//düğüm sayısı
		int i = 1;
		if(head == null) {
			return (i-1);
		}
		else {
			Node temp = head;
			for( ; temp.next != null ; i++) {
				temp = temp.next;
			}
			return i;
		}
	}
	
	void addBetween(int index, int data) {	//araya ekle
		if(index >= 0) {
			if(index <= number()) { //doğru aralık
				if(index == 0) {	//başa ekle
					addFirst(data);
				}
				else if(index == number()) {	//sona ekle
					addLast(data);
				}
				else {
					Node element = obj(data);
					Node temp1 = head, temp2;
					int i = index;
					
					while((i-1) != 0) {
						temp1 = temp1.next;
						i--;
					}
					temp2 = temp1.next;
					temp1.next = element;
					element.next = temp2;
					System.out.println(index + ". indekse düğüm yerleştirildi. !");
				}
			}
			else {	//yanlış aralık
				System.out.println("İndeks değeri geçerli değil. düğüm sayısı: " + number() + ", indeks değeri: " + index);
			}
		}
		else {	//negatif indeks
			System.out.println("İndeks değeri doğal sayı olmalıdır.");
		}
	}
	
	void deleteBetween(int index) {	 //aradan çıkar.
		if(index >= 0) {	//doğru aralık.
			
			if(number() != 0) {	// liste boş değil
				if(index < number()) {	//geçerli
				if(index == 0) {	//baştan çıkar
					deleteFirst();
				}
				else if(index == number()-1) {	//sondan çıkar.
					deleteLast();
				}
				else {	//aradan çıkar.
					int i = index;
					Node temp1 = head, temp2;
					while((i-1) != 0) {
						temp1 = temp1.next;
						i--;
					}
					temp2 = temp1.next.next;
					temp1.next.next =null;
					temp1.next = temp2;
					System.out.println(index + ". indeksten düğüm silindi !");
				}
			}
			else { //geçersiz
				System.out.println("İndeks değeri geçerli değil. düğüm sayısı: " + number() + ", indeks değeri: " + index);
			}
			}
			else { // boş liste.
				System.out.println("Liste boş. Düğüm silinemiyor.");
			}
			
		}
		else {	//negatif
			System.out.println("indeks değeri doğal sayı olmalıdır.");
		}
	}
}
