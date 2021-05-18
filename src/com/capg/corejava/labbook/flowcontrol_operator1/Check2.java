package com.capg.corejava.labbook.flowcontrol_operator1;

import java.util.Scanner;

public class Check2 {
	
	public int checkNumber(int n)
	{
		
		while(n!=1)
		{
			if(n%2!=0)
			{
				return 0;
			}
			n = n/2;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Check2 c=new Check2();
		System.out.println("enter the value of n: ");
		int n= sc.nextInt();
		int t=c.checkNumber(n);
		if(t==1)
			System.out.println("The number is power of 2");
		else
			System.out.println("The number is not a power of 2");
}

}
