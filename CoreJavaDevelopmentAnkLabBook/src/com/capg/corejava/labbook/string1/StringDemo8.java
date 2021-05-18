package com.capg.corejava.labbook.string1;

import java.util.*;

public class StringDemo8 {
	static boolean isPositive(String str)
	{
		
		int n = str.length();
		char c[] = new char[n];
		for(int i=0;i<n;i++)
		{
			
			c[i] = str.charAt(i);
		}
		
		Arrays.sort(c);
		for(int i=0;i<n;i++)
		{
			if(c[i] !=str.charAt(i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string ");
		str = sc.next();
		if(isPositive(str))
		{
			System.out.println("Yes it is a positive string");
		}
		else
		{
			System.out.println("No,it is  not a positive string");
		}

	}

}

