package com.capg.corejava.labbook.flowcontrol_operator1;
import java.util.Scanner;
public class Sum {
	
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sum s=new Sum();
		System.out.println("enter the value of n: ");
		int n= sc.nextInt();
		int t=s.calculateSum(n);
		System.out.println("The sum of n natural numbers which is divisible by 3 or 5: "+t);

	}

}
