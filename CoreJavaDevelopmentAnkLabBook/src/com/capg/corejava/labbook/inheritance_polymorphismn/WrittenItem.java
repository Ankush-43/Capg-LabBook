package com.capg.corejava.labbook.inheritance_polymorphismn;

public abstract class WrittenItem extends Item1{
	private String author;  
    WrittenItem(int identification_number, String title, int number_of_copies,String author) {
		super(identification_number, title, number_of_copies);
		// TODO Auto-generated constructor stub
		this.author = author;
	}

	
	
	void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor() {
		return author;
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
   
	//public void print()
	//{   System.out.println("Display the info of the book ");
	//	super.print();
	//	System.out.println("Author of the book  "+author);
		
	//}

	public boolean equals(Object obj)
	{
		
		if(obj == null)
			return false;
		WrittenItem wt = (WrittenItem)obj;
		return super.equals(wt) && author == wt.author;
	
	}

}
