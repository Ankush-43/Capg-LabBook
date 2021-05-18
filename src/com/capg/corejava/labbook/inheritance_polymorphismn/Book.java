package com.capg.corejava.labbook.inheritance_polymorphismn;

public class Book extends WrittenItem {

	Book(int identification_number, String title, int number_of_copies, String author) {
		super(identification_number, title, number_of_copies, author);
	}
	
	public boolean equals(Object obj)
	{
		
		if(obj == null)
			return false;
		Book ot = (Book)obj;
		return super.equals(ot);
	
	}
	public String toString()
	{
		return super.toString();
		
	}
	public int getIdentification_number() {
		return super.getIdentification_number();
	}



	public String getTitle() {
		return super.getTitle();
	}



	public int getNumber_of_copies() {
		return super.getNumber_of_copies();
	}
	
	public void print()
	{  System.out.println("Display info of the book ");
		super.print();
		System.out.println("Author of the book "+super.getAuthor());
		
	}
	public void checkIn()
	{   
		super.checkIn();
	}
	public void checkOut()
	{   
		super.checkOut();
	}
	public void addItem()
	{   
		super.addItem();
	}
	


	

}
