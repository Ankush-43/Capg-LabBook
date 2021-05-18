package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	public EmployeeException(String message)
	{
		System.out.println("Your salary is"+message);
	}

}
