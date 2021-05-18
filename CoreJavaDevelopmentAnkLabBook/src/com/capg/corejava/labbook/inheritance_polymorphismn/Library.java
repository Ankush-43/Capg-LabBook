package com.capg.corejava.labbook.inheritance_polymorphismn;


public class Library {

	public static void main(String[] args) {
		Book b = new Book(12345,"To kill a mocking bird", 5, "Harper Lee"); 
		
		b.addItem(12345,"To kill a mocking bird", 5);
		b.print();
		System.out.println("After check out number of copies left ");
		b.checkOut();
		b.print();
		System.out.println("After adding another one element  number of copies left ");
		b.addItem();
		b.print();
		Video v = new Video(1111, "The GodFather", 3, 215, "ff", "drama", 1981);
		v.addItem(1111, "The GodFather", 3);
		v.print();
		System.out.println("After check in number of copies left ");
		v.checkIn();
		v.print();
		
		

	}
}
