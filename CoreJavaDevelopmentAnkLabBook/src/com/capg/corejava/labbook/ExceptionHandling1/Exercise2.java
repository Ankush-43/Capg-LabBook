package com.capg.corejava.labbook.ExceptionHandling1;
import java.util.Scanner;
	class NameMissingException extends Exception
	{
		NameMissingException(String message)
		{
			System.out.println("Your name is"+message);
		}
	}
public class Exercise2{
	
	public void myData(String fname,String mname,String lname) throws NameMissingException
	{
		
		if(fname==null || lname==null || fname=="" || lname=="")
		throw	new NameMissingException(" not valide");
		else
		{
			if(mname=="" || mname==null)
				System.out.println("Your name is:"+fname+" "+lname);
			else
				System.out.println("Your name is:"+fname+" "+mname+" "+lname);
		}
				
	}
	public static void main(String[] args) {

		try {
			Exercise2 ude=new Exercise2();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name :");
			String fname=sc.nextLine();
			System.out.println("Enter the middle name :");
			String mname=sc.nextLine();
			System.out.println("Enter the last name :");
			String lname=sc.nextLine();
			ude.myData(fname,mname,lname);
		}
		catch(Exception ee)
		{
			System.out.println("I can handle:"+ee);
		}

	}

}

