package ders09;

public class List {
	private Node head, tail;
	List(){
		head = tail = null;
	}
	
	private Node obj(int data) {
		Node element = new Node(data);
		return element;
	}
	
	void addLast(int data) {
		Node eleman = obj(data);
		if(head == null) {
			head = tail = eleman;
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
		}
		else {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			System.out.println("Sona düğüm eklendi.");
		}
	}
	
	void addFirst(int data) {
		Node eleman = obj(data);
		if(head == null) {
			head = tail = eleman;
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
		}
		else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println("Başa düğüm eklendi.");
		}
	}
	
	void deleteLast() {
		if(head == null) {
			System.out.println("Liste boş. Düğüm silinemiyor.");
		}
		else {
			if(head.next == null) {
				head = tail = null;
				System.out.println("Kalan son düğüm de silindi.");
			}
			else {
				Node temp = tail.prev;
				temp.next = tail.prev = null;
				tail = temp;
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
				head = tail = null;
				System.out.println("Kalan son düğüm de silindi.");
			}
			else {
				Node temp = head.next;
				head.next = temp.prev = null;
				head = temp;
				System.out.println("Baştan düğüm silindi.");
			}
		}
	}
	
	//----//
	
	void print() {
		if(head == null) {
			System.out.println("Liste boş.");
		}
		else {
			Node temp = head;
			System.out.println("-- Liste --");
			for(int i = 1; temp != null; i++) {
				System.out.println(i + ": " + temp.data);
				temp = temp.next;
			}
			System.out.println("-----------");
		}
	}
	void tnirp() {
		if(head == null) {
			System.out.println("Liste boş.");
		}
		else {
			Node temp = tail;
			System.out.println("-- Liste --");
			for(int i = 1; temp != null; i++) {
				System.out.println(i + ": " + temp.data);
				temp = temp.prev;
			}
			System.out.println("-----------");
		}
	}
	
	int numberH() {
		int i = 1;
		if(head == null) {
			return (i-1);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
				i++;
			}
			return i;
		}
	}
	int numberT() {
		int i = 1;
		if(tail == null) {
			return (i-1);
		}
		else {
			Node temp = tail;
			while(temp.prev != null) {
				temp = temp.prev;
				i++;
			}
			return i;
		}
	}
	
}
