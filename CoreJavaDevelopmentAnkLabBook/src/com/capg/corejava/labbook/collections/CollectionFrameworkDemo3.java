package com.capg.corejava.labbook.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionFrameworkDemo3 {
	public void getSquares(int [] arr)
	{
		
		HashMap<Integer,Integer>hmap = new HashMap<Integer,Integer>();
		
		for(int val : arr)
		{
			hmap.put(val, val*val);
			
		}
		for(Map.Entry<Integer, Integer> e : hmap.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n ");
		n = sc.nextInt();
		int []  arr= new int[n] ;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
	
		CollectionFrameworkDemo3 cd = new CollectionFrameworkDemo3();
		cd.getSquares(arr);

	}

}
