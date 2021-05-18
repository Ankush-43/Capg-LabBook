package com.capg.corejava.labbook.string1;

import java.util.Scanner;
import java.lang.*;

public class StringDemo4 {
	private static String modifyNumber(String number) {
	     // variable to store sum of digits
	     int diff = 0;

	     String result = "";
	     char ch,ch2 ;

	    
	     int n;
	     int m;

	   
	     for(int i=0; i<number.length()-1; i++) {

	       
	         ch = number.charAt(i);
	         ch2= number.charAt(i+1);

	         // check character is digit?
	         if(Character.isDigit(ch) && Character.isDigit(ch2) ) {

	             // find numeric value of character
	             n = Character. getNumericValue(ch);
	             m = Character.getNumericValue(ch2);
	             // then add it to sum variable
	            diff = Math.abs(n-m);
	            //System.out.println("The modified number is "+diff );
	            result = result + diff;
	            
	          }
	      }
	     result = result + number.charAt(number.length()-1) ;

	      // return result value
	      return result;
	}

	public static void main(String[] args) {
		 String str = "";
	      String sum = " ";

	      // create Scanner class object 
	      // for reading the values
	      Scanner scan =  new Scanner(System.in);

	      // read inputs
	      System.out.print("Enter String:: ");
	      str = scan.next();

	      // find sum of digits in the String
	      sum = modifyNumber(str);

	      // display result
	      System.out.println("The modified number is "+sum );

	      // close Scanner class object
	      scan.close();


	}


	
}


