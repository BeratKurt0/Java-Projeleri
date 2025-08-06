package ders08;

public class Node {
	String name, surename;
	int age;
	Node next;
	
	public Node(String name, String surename, int age) {
		this.name = name;
		this.surename = surename;
		this.age = age;
		next = null;
	}
}
