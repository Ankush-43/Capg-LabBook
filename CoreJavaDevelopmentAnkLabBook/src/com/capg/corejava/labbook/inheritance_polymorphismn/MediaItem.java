package com.capg.corejava.labbook.inheritance_polymorphismn;

public abstract class MediaItem extends Item1 {
	private int runtime;

	MediaItem(int identification_number, String title, int number_of_copies,int runtime) {
		super(identification_number, title, number_of_copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}
	
	public boolean equals(Object obj)
	{
		
		if(obj == null)
			return false;
		MediaItem ot = (MediaItem)obj;
		return super.equals(ot) &&
				runtime==ot.runtime;
	
	}
	public String toString()
	{
		return super.toString()+runtime;
		
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
	//{   System.out.println("Info  ");
	//	super.print();
		//System.out.println("Runtime is  "+runtime);
		
	//}
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


class Video extends MediaItem
{
    private String director;
    private String genre;
    private int year;
	Video(int identification_number, String title, int number_of_copies,int runtime, String director,String genre,int year) {
		super(identification_number, title, number_of_copies,runtime);
		// TODO Auto-generated constructor stub
		this.director = director;
		this.genre= genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public String getGenre() {
		return genre;
	}
	public int getYear() {
		return year;
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
	
	{   System.out.println("Info about video ");
		super.print();
		 System.out.println("Runtime is "+super.getRuntime());
		 System.out.println("Director is "+director);
		 System.out.println("Genre is "+genre);
		 System.out.println("year is "+year);
	}
	public String toString()
	{return super.toString()+director+genre+year;
		}
	

}
class CD extends MediaItem
{
	private String artist;
	private String genre;
	CD(int identification_number, String title, int number_of_copies,int runtime,String artist,String genre) {
		super(identification_number, title, number_of_copies,runtime);
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.genre= genre;
	}
	public String getArtist() {
		return artist;
	}
	public String getGenre() {
		return genre;
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
	
	{  
		super.print();
		 System.out.println("Artist is "+artist);
		 System.out.println("Genre is "+genre);
		 
	}
public String toString()
{return super.toString()+artist+genre;
	}


}





