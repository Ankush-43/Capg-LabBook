package com.capg.corejava.labbook.string1;
import java.util.Scanner;
public class StringDemo5 {
	
	public static void count(String string)  
    {  
      int nw=0,nl=1;  
        char ch[]= new char[string.length()]; 
        int n=string.length();
        for(int i=0;i<n;i++)  
        {  
            ch[i]= string.charAt(i);  
            if(ch[i]=='\n')
            	nl++;
            else if(ch[i]==' ')
            	nw++;
            
        }
        System.out.println("\nNumber of lines : "+nl);
        System.out.println("\nNumber of words : "+(nl+nw));
        System.out.println("\nNumber of characters : "+n);
        /*for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count1++;  
        }*/
        
    }  
  public static void main(String[] args) {  
	  
	  Scanner sc =  new Scanner(System.in);
	  System.out.print("Enter String:: ");
      String str = sc.nextLine();
      count(str);   
}  

}
