package ders02;

public class Liste {
	Node head;	//baş düğüm.
	
	Liste(){
		head = null;	// varsayılan olarak baş düğüm 'null' değerlikli
	}
	
	private Node obj(int data) {	//düğüm oluşturma metodu.
		Node eleman = new Node(data);
		return eleman;
		// veri güvenliği açısından private olması daha iyidir.
	}
	
	void düğümEkle(int data) { 
		//düğüm ekleme metodu (eklenecek veriyi parametre olarak alır.)
		
		if (head == null) {	// baş düğüm boş mu ? , eğer boş ise
			
			head = obj(data);	//düğümü oluşturur ve baş düğüme yerleştirir.
			
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi !");
			
		} else {	//son düğüm bulunmalıdır.
			
			Node temp = head;
			
			while(temp.next != null) {	//son düğüme gelene kadar döngü ilerler.
				temp = temp.next;	//bir sonraki düğüme geçilir.
			}
			//temp artık son düğüm olur.
			temp.next=obj(data);
			System.out.println("Sona düğüm eklendi !");
		}
	}
	
	
}
