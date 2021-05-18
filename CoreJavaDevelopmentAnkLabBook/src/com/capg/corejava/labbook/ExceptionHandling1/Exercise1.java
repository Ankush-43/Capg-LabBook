package com.capg.corejava.labbook.ExceptionHandling1;
import java.util.Scanner;
	class AgeNotSupportException extends Exception
	{
		AgeNotSupportException(String message)
		{
			System.out.println("Your age is"+message);
		}
	}




public class Exercise1{
	
	
	public void myData(int age) throws AgeNotSupportException
	{
		
		if(age<=15)
		throw	new AgeNotSupportException("Not Eligible");
		else
			System.out.println("Eligible");
	}

	public static void main(String[] args) {

		try {
			Exercise1 ude=new Exercise1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age :");
			int age=sc.nextInt();
			ude.myData(age);
		}
		catch(Exception ee)
		{
			System.out.println("I can handle:"+ee);
		}

	}

}

