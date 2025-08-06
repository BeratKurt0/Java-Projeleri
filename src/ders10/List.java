package ders10;

public class List {
	
	private Node head, tail;
	
	List() {
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
	
	int number() {
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
	
	//----//
	
	void addBetween(int index, int data) {
		if(index >= 0) {
			if(index <= number()) {
				if(index == 0) {
					addFirst(data);
				}
				else if(index == number()) {
					addLast(data);
				}
				else {
					Node eleman = obj(data);
					Node temp1 = head, temp2;
					int i = index;
					while((i-1) != 0) {
						temp1 = temp1.next;
						i--;
					}
					temp2 = temp1.next;
					temp1.next = temp2.prev = eleman;
					eleman.next = temp2;
					eleman.prev = temp1;
					System.out.println(index + ". indekse düğüm yerleştirildi.");
				}
			}
			else {
				System.out.println("indeks değeri geçerli aralıkta değildir. "
						+ "Düğüm sayısı: " + number() + " ,indeks değeri: " + index);
			}
		}
		else {
			System.out.println("İndeks değeri negatif olmamalıdır.");
		}
	}
	
	void deleteBetween(int index) {
		if(index >= 0) {
			if(head != null) {
				if(index < number()) {
					if(index == 0) {
						deleteFirst();
					}
					else if(index == number()-1) {
						deleteLast();
					}
					else {
						Node temp1 = head, temp2;
						int i = index;
						while((i-1) != 0) {
							temp1=temp1.next;
							i--;
						}
						temp2 = temp1.next.next;
						temp1.next.next = temp2.prev.prev = null;
						temp1.next = temp2;
						temp2.prev = temp1;
						System.out.println(index + ". indeksteki düğüm silindi.");
					}
				}
				else {
					System.out.println("indeks değeri geçerli aralıkta değildir. "
							+ "Düğüm sayısı: " + number() + " ,indeks değeri: " + index);
				}
			}
			else {
				System.out.println("Liste boş. Düğüm silinemez.");
			}
		}
		else {
			System.out.println("İndeks değeri negatif olmamalıdır.");
		}
	}
}