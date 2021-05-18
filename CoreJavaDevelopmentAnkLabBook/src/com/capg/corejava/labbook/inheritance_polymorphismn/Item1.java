package com.capg.corejava.labbook.inheritance_polymorphismn;

public abstract class Item1 {

	
		// TODO Auto-generated method stub
		    /**
		     * 
		     */
		    private int identification_number;
		    private String title;
		    private int number_of_copies;
		    
		    Item1(int identification_number,String title,int number_of_copies)
		    {
		    	this.identification_number = identification_number;
		    	this.title = title;
		    	this.number_of_copies = number_of_copies;
		    }
		    public int getIdentification_number() {
				return identification_number;
			}



			public String getTitle() {
				return title;
			}



			public int getNumber_of_copies() {
				return number_of_copies;
			}

			
			
			public void setIdentification_number(int identification_number) {
				this.identification_number = identification_number;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public void setNumber_of_copies(int number_of_copies) {
				this.number_of_copies = number_of_copies;
			}
			public void addItem(int identification_number, String title,int number_of_copies )
			{
				setIdentification_number(identification_number);
				setTitle(title);
				setNumber_of_copies(number_of_copies);
			}
			public void addItem()
			{
				number_of_copies++;	
			}
			public void checkIn()
			{
				number_of_copies = number_of_copies + 1;
			}
			public  void checkOut()
			{
				number_of_copies = number_of_copies - 1;
			}
			
			public String Item1()
			{
				return identification_number+title+number_of_copies;
			}
			
			
			public void print()
			{   System.out.println("identification number "+identification_number);
				System.out.println("Title "+title);
				
				System.out.println("Number of copies are "+number_of_copies);
			}
			
			public boolean equals(Object obj)
			{
				
				if(obj == null)
					return false;
				Item1 ot = (Item1)obj;
				return identification_number == ot.identification_number && title == ot.title && number_of_copies==ot.number_of_copies;
			
			}

}
