package com.capg.corejava.labbook.collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionFrameworkDemo5 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of array ");
		n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		ArrayList<Integer> arr_list  = new ArrayList<Integer>();
		for(int element: arr)
		{
			arr_list.add(element);
			
		}
		Collections.sort(arr_list);
		System.out.println("The second smallest element will be "+arr_list.get(1));

	}

}
