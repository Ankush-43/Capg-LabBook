package com.capg.corejava.labbook.flowcontrol_operator1;

import java.util.Scanner;



public class Difference {
	
	public int calculateDifference(int n)
	{
		int s1=0,s2=0,d1;
		for(int i=1;i<=n;i++)
		{
			s1=s1+(i*i);
			s2=s2+i;
			s2=s2*s2;
		}
		d1=s1-s2;
		return d1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Difference d=new Difference();
		System.out.println("enter the value of n: ");
		int n= sc.nextInt();
		int t=d.calculateDifference(n);
		System.out.println("The difference between the sum of the squares of the first n natural numbers and the square of their sum: "+t);
}
}