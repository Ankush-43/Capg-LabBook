package com.capg.corejava.labbook.arrays1;
import java.util.Scanner;
import java.util.Arrays;
public class Array3 {
	
	public int [] getSorted(int[] arr)
	{
		int n = arr.length;

		for(int i=0;i<n;i++)
		{
			
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i]= Integer.parseInt(String.valueOf(s));
			
		}
		Arrays.sort(arr);
		
		return arr;
		
		
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
		
		Array3 ad = new Array3();
		int [] result_array = new int[arr.length];
		result_array = ad.getSorted(arr);
		for(int i=0;i<result_array.length;i++)
		{
			System.out.println(result_array[i] + " ");
		}
	}

}
