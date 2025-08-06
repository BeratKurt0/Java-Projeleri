package ders01;

public class Örnek_2 {
	public static void main(String[] args) {
		Node a = new Node(7);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(6);
		Node e = new Node(2);
		
		a.next=b;	b.next=c;
		c.next=d;	d.next=e;
		
		System.out.println("e öğrencisinin tuttuğu sayı: "+a.next.next.next.next.sayı);
	}
}

class Node { //düğümleri oluştururken genellikle "node" ismi verilir. 
	int sayı;
	Node next;
	Node(int sayı){
		this.sayı=sayı;
		next=null;
	}
	
} 
