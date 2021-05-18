package com.capg.corejava.labbook.collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionFrameworkDemo4 {
    
	public static void main(String[] args) {
		int n;
		String reg_no ="";
		double marks;
		String grade = "";
		Scanner sc = new Scanner(System.in);
		HashMap<String,Double> hmap = new HashMap<String,Double>();
		System.out.println("Number of inputs to take ");
		n = sc.nextInt();
		while(n!=0)
		{
		System.out.println("The registration number is ");
		reg_no = sc.next();
		System.out.println("The value of marks is ");
		marks = sc.nextDouble();
		hmap.put(reg_no, marks);
		n--;
		
		}
		HashMap<String,String> result_map = new HashMap<String,String>();
		for(Entry<String, Double> e : hmap.entrySet())
		{
			if(e.getValue()>=90)
			{
				grade = "Gold";
				
				
			}
			else if(e.getValue()>=80 && e.getValue()<90)
			{
				grade = "Silver";
				
			}
			else if(e.getValue()>=70 && e.getValue()<80)
			{
				grade = "Bronze";
			}
			
			else
			{
				grade = "Average";
			}
			result_map.put(e.getKey(), grade);
		}
		for(Entry<String, String> e2 : result_map.entrySet())
		{
			System.out.println(e2.getKey()+" "+e2.getValue());
		}
		
		
        
	}

}
