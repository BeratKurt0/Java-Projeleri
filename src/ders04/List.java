package ders04;

public class List {
	private Node head;
	
	List() {
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
	 
	 void deleteLast() {	// sondan silme metodu.
		// sorulacak ilk soru : düğüm boş mu, dolu mu ?
		 if(head == null) {
			 System.out.println("Liste boş. Düğüm silinemiyor.");
		 }
		 
		 else {	//2. soru: düğüm tek mi, birden fazla mı ?
			 if(head.next == null) {
				 head=null;
				 System.out.println("Kalan son düğüm de silindi !");
			 }
			 
			 else {
				 Node temp=head;
				 while(temp.next.next != null) {
					 temp = temp.next;
				 }
				 temp.next = null;
				 System.out.println("Sondan düğüm silindi !");
			 }
		 }
	 }
	 
	 void print() {
		 if(head == null) {
			 System.out.println("----- Liste Boş -----");
		 }
		 else {
			 Node temp = head;
			 System.out.println("----- Liste -----");
			 while(temp!=null) {
				 System.out.println(temp.data);
				 temp=temp.next;
			 }
			 System.out.println("-----------------");
		 }
	 }
	 
}
