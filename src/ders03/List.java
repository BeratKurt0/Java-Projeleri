package ders03;

public class List {
	private Node head; 		// veri güvenliği için önemli.
	
	List() {
		head=null;
	}
	
	private Node obj(String name, int bornYear) {
		Node element=new Node(name,bornYear);
		return element;
	}
	
	void addLast(String name, int bornYear) {
		if(head == null) {
			head = obj(name,bornYear);
			System.out.println("Liste oluşturuldu. İlk düğüm eklendi !");
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = obj(name,bornYear);
			System.out.println("Düğüm eklendi !");
		}
	}
	
	void print() {	// yazdırma metodu.
		
		if(head == null) {
			System.out.println("----- Liste Boş -----");
		}
		else {
			Node temp = head;
			
			System.out.println("----- Liste -----");
			while(temp != null) {	// döngüde temp.next değil, sadece temp yazılmış olur.
				System.out.println("isim: "+ temp.name +"  Doğum tarihi: "+ temp.bornYear);
				temp = temp.next;	//düğümü bir ilerletmeyi unutmayın :)
			}
			System.out.println("-----------------");
		}
		
	}
}
