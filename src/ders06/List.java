package ders06;

public class List {
	private Node head;
	
	List(){
		head = null;
	}
	
	private Node obj(String data) {
		Node element = new Node(data);
		return element;
	}
	
	void addLast(String data) { //sona ekle
		if(head == null) {
			head = obj(data);
			System.out.println("Sepete ilk ürün eklendi. Eklenen ürün: " + head.data);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = obj(data);
			System.out.println("sona ürün eklendi. Eklenen ürün: " + temp.next.data);
		}
	}
	
	void addFirst(String data) { //başa ekle
		if(head == null) {
			head = obj(data);
			System.out.println("Sepete ilk ürün eklendi. Eklenen ürün: " + head.data);
		}
		else {
			Node temp = obj(data);
			temp.next = head;
			head = temp;
			System.out.println("başa ürün eklendi. Eklenen ürün: " + head.data);
			}
		}
	
	void deleteLast() { //sondan çıkar
		if(head == null) {
			System.out.println("----- Sepet boş -----");
		}
		else {
			if(head.next == null) {
				System.out.println("Son ürün de sepetten çıkarıldı. Çıkarılan ürün: " + head.data);
				head = null;
			}
			else {
				Node temp = head;
				while(temp.next.next != null) {
					temp = temp.next;
				}
				System.out.println("sondan ürün çıkarıldı. Çıkarılan ürün: " + temp.next);
				temp.next =  null;
			}
		}
	}
	
	void deleteFirst() { // baştan çıkar
		if(head == null) {
			System.out.println("----- Sepet boş -----");
		}
		else {
			if(head.next == null) {
				System.out.println("Son ürün de sepetten çıkarıldı. Çıkarılan ürün: " + head.data);
				head = null;
			}
			else {
				System.out.println("baştan ürün çıkarıldı. Çıkarılan ürün: " + head.data);
				Node temp = head.next;
				head.next = null;
				head = temp;
			}
		}
	}
	
	void print() { // ürünleri yazdır.
		if(head == null) {
			System.out.println("----- Sepet Boş -----");
		}
		else {
			Node temp = head;
			System.out.println("--------- Sepet ---------\n");
			for(int i = 1; temp != null; i++) {
				System.out.println(i + ".) " + temp.data);
				temp = temp.next;
			}
			System.out.println("--------------------------\n");
		}
	}
}	

