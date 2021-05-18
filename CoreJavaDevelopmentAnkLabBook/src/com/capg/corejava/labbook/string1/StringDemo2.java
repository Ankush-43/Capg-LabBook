package com.capg.corejava.labbook.string1;

import java.util.Scanner;
public class StringDemo2 {
	public String getImage(String str)
	{
		String imagestr =""+str;
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();
		//System.out.println("The resultant string is "+sb);
		imagestr = imagestr +"|"+ sb;
		return imagestr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string ");
		str = sc.next();
		StringDemo2 sds = new StringDemo2();
		String res_str = sds.getImage(str);
		System.out.println("The resultant string is "+res_str);
		

	}

}
