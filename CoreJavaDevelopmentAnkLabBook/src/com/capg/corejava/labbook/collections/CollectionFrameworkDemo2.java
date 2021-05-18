package com.capg.corejava.labbook.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionFrameworkDemo2 {
	public void countChar(String str)
	{
		
		HashMap<Character,Integer>hmap = new HashMap<Character,Integer>();
		char [] strArray = str.toCharArray();
		for(char ch : strArray)
		{
			if(hmap.containsKey(ch))
			{
				hmap.put(ch,hmap.get(ch)+1);
			}
			else
			{
				hmap.put(ch, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> e : hmap.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		str = sc.nextLine();
		CollectionFrameworkDemo2 cd = new CollectionFrameworkDemo2();
		cd.countChar(str);

	}
}
