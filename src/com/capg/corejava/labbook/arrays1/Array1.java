package com.capg.corejava.labbook.arrays1;
import java.util.Arrays;
import java.util.Scanner;


public class Array1 {
	
	public int getSecondSmallest(int [] ar)
	{
		Arrays.sort(ar);
		return ar[1];
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Array1 ad = new Array1();
		int secondsmallest= ad.getSecondSmallest(arr);
		System.out.println(secondsmallest);

	}

}
