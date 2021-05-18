package com.capg.corejava.labbook.flowcontrol_operator1;

import java.util.Scanner;

public class Check {
	
	public boolean checkNumber(int num)
	{
		
		boolean flag=false;
		 int currentDigit = num % 10;
		
	       num = num/10;
	        
	       while(num>0){
	           if(currentDigit < num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
		
	}
	       return flag;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Check c=new Check();
		System.out.println("enter the value of n: ");
		int n= sc.nextInt();
		boolean t=c.checkNumber(n);
		if(t)
			System.out.println("Digits are not in increasing order.");
		else
			System.out.println("Digits are in increasing order.");
}

}
