package com.cg.eis.exception;


import java.util.Scanner;



class SalaryNotEnoughException extends Exception
{
	SalaryNotEnoughException(String message) 
	{
		System.out.println("salary of this employee is "+message);
	}

}


public  class ExceptionHandling3 {
	
	public void checkSalary(double salary) throws SalaryNotEnoughException
	{
		
	   
	    if (salary<3000.0)
	    	throw new SalaryNotEnoughException("Not enough");
	    else
	    	System.out.println("valid");


	}

	public static void main(String[] args) {
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary ");
		salary = sc.nextDouble();
		try
		{
			ExceptionHandling3 uex = new ExceptionHandling3();
		uex.checkSalary(salary);
		}
		catch(Exception e)
		{
			System.out.println("The exception is handled "+e);
		}
	}

}