package com.capg.corejava.labbook.collections;


import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class CollectionFrameworkDemo7
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		n = sc.nextInt();
		int val;
		ArrayList<Integer> input_array = new ArrayList<Integer>();
		ArrayList<Integer> result_array = new ArrayList<Integer>();
		System.out.println("Enter the values of array ");
		while(n!=0)
		{ 
			val=sc.nextInt();
			input_array.add(val);
			n--;
		}
		for(int element:input_array)
		{
			StringBuffer s = new StringBuffer(String.valueOf(element));
			s.reverse();
			element= Integer.parseInt(String.valueOf(s));
			result_array.add(element);
		}
		Collections.sort(result_array);
		System.out.println("The resultant array is ");
		
        for(int i: result_array)
        {
        	System.out.println(i);
        }
	}

}
