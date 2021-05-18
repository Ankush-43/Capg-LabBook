package com.capg.corejava.labbook.ExceptionHandling1;
import com.cg.eis.exception.EmployeeException;
import java.util.Scanner;

public class Exercise3{
	
	public void myData(int sal) throws EmployeeException
	{
		
		if(sal<3000)
		throw	new EmployeeException(" too less");
		else
			System.out.println("Your salary is: "+sal);
				
	}
	public static void main(String[] args) {

		try {
			Exercise3 ude=new Exercise3();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the salary :");
			int sal=sc.nextInt();
			ude.myData(sal);
		}
		catch(Exception ee)
		{
			System.out.println("I can handle:"+ee);
		}

	}

}

