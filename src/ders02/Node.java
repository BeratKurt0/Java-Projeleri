package ders02;

public class Node { //Düğüm
	int data; 	//veri (şimdilik bir tane tamsayı verisi tutalım.)
	Node next; 	// sonraki düğüm.
	
	Node(int data){
		this.data=data;
		next=null;	//şimdilik 'null' değerlikli 
	}
}
