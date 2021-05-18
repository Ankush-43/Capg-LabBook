package com.capg.corejava.labbook.collections;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CollectionFrameworkDemo6 {
   public static Date StringToDate(String dob) throws ParseException{
     
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    
      Date date = formatter.parse(dob);
      //System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException {
      //Reading name and date of birth from the user
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("Enter the number  of values ");
      n = sc.nextInt();
      HashMap<String,Integer> hmap = new HashMap<String,Integer>();
      ArrayList<String> result_array = new ArrayList<String>();
      while(n!=0)
      {
      System.out.println("Enter your id: ");
      String reg_ID = sc.next();
      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
      String dob = sc.next();
      
      //Converting String to Date
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
      
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate();
     
      Period period = Period.between(givenDate, LocalDate.now());
      //System.out.print("Hello "+name+" your current age is: ");
     
      hmap.put(reg_ID,period.getYears());
      n--;
   }
      for(Map.Entry<String, Integer> e: hmap.entrySet())
      {
    	  if(e.getValue()>=18)
    	  {
    		  result_array.add(e.getKey());
    	  }
    	  
      }
      System.out.println("Eligible candidates who are able to vote ");
      
       for(String s:result_array)
       {
    	   System.out.println(s);
       }
       
      
   
   
   }
}
