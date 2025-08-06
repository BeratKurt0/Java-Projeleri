package ders05;

public class List {
	private Node head;
	
	List(){
		head=null;
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
			System.out.println("sona düğüm eklendi !");
		}
	}
	
	void deleteLast() {
		if(head == null) {
			System.out.println("Liste boş. Düğüm silinemiyor.");
		}
		else {
			if(head.next == null ) {
				head =null;
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
	
	void addFirst(int data) {	//başa ekleme metodu.
		if(head == null) {
			head = obj(data);
			System.out.println("Liste oluşturuldu ve düğüm eklendi !");
		}
		else {	//yine temp'e ihtiyaç var.
			Node temp = obj(data);
			temp.next = head;
			head = temp;
			System.out.println("Başa düğüm eklendi !");
		}
	}
	
	void deleteFirst() {	//baştan sil metodu.
		// tekrardan iki soru soracağız.
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
				head.next = null; head = temp;
				System.out.println("Baştan düğüm çıkarıldı !");
			}
		}
		
	}
	
	void print() {
		if (head == null) {
			System.out.println("----- Liste Boş -----");
		} 
		else {
			Node temp = head;
			System.out.println("----- Liste -----");
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println("-----------------");
		}
	}
}
