package com.capg.corejava.labbook.string1;

import java.util.Scanner;

class StringDemo3
{
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
  
        for (int i=0; i<text.length(); i++)
        {
           if(text.charAt(i)=='A'|| text.charAt(i)=='E' || text.charAt(i)=='I' || text.charAt(i)=='O'|| text.charAt(i)=='U'
        		|| text.charAt(i)=='a' ||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o' ||text.charAt(i)=='u')
           {

        	   result.append(text.charAt(i));
           }
         	  
        	
        
           else
           {
        	   if (Character.isUpperCase(text.charAt(i)))
               {
                   char ch = (char)(((int)text.charAt(i) +
                                     s - 65) % 26 + 65);
                   result.append(ch);
               }
               else
               {
                   char ch = (char)(((int)text.charAt(i) +
                                     s - 97) % 26 + 97);
                   result.append(ch);
               }
        	   
           }
        }
        return result;
    }
  
    // Driver code
    public static void main(String[] args)
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string ");
        String text = sc.next();
        int s = 1;
        System.out.println("Text  : " + text);
        //System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}

