package com.capg.corejava.labbook.inheritance_polymorphismn;

public class JournalPaper extends WrittenItem{
	private int pubYear;
	JournalPaper(int identification_number, String title, int number_of_copies, String author,int pubYear) {
		super(identification_number, title, number_of_copies, author);
		this.pubYear = pubYear;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return super.toString()+pubYear;
		
	}
	public int getPubYear() {
		return pubYear;
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
	{   System.out.println("Display year of the book published "+pubYear);
		super.print();
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
