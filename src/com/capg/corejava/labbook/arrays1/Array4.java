package com.capg.corejava.labbook.arrays1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array4 {
	
	public int modiftArray(Integer[] arr)
	{ int n = arr.length;
		if (n==0 || n==1){  
            return n;  
        }  
        int[] t = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                t[j++] = arr[i];  
            }  
         }  
        t[j++] = arr[n-1];     
         
        for (int i=0; i<j; i++){  
            arr[i] = t[i];  
        }  
        return j;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		n = sc.nextInt();
		Integer [] arr = new Integer[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		Array4 ad = new Array4();
		int len = ad.modiftArray(arr);
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i] + " ");
		}

	}

}
