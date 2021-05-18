package com.capg.corejava.labbook.Layered_Architecture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMainConroller {
	

	public static void main(String[] args) {
		int n=0;
		int id=0;
		String name = null;
		double salary=0.0;
		String designation ="";
		String schemedetail=null;
		HashMap<Integer,List> result_hmap = new HashMap<Integer,List>();
		List output_list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of input you want to take");
		n = sc.nextInt();
		
		while(n!=0)
		{
		System.out.println("Enter id of the employee");
		id = sc.nextInt();
		System.out.println("Enter name of the employee");
		name = sc.next();
		System.out.println("Enter salary of the employee");
		salary = sc.nextDouble();
		System.out.println("Enter designation of the employee");
		designation = sc.next();
		
		
	    EmployeeService  employeeService=new EmployeeService();
	    result_hmap.putAll(employeeService.addEmployeeService(id,name,salary,designation));
	
		n--;
	
		
		}
		System.out.println("Number of scheme to show the details of employees ");
		schemedetail = sc.next();
		sc.close();
		System.out.println("Main controller Return value is : "+result_hmap);
		
		
		for(Map.Entry<Integer,List> entry : result_hmap.entrySet())
		{
			//System.out.println("Key "+entry.getKey()+" values"+entry.getValue());
			output_list = entry.getValue();
			if(schemedetail.equals(output_list.get(4)))
			{
				System.out.println("Employee id "+output_list.get(0));
				System.out.println("Employee name is "+output_list.get(1));
				System.out.println("Employee designation "+output_list.get(2));
				System.out.println("Employee salary "+output_list.get(3));
				System.out.println("Employee healt insurance scheme is "+output_list.get(4));
			}
				
			
			
		}

	}

}
