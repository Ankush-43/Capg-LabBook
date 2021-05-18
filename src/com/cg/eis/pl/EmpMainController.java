package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.cg.eis.service.EmpService;



public class EmpMainController {

	public static void main(String[] args) {
		
		int empId,sal;
		String name,designaton,insuranceScheme;
		
		Scanner sc=new Scanner(System.in);
		int ch;
		boolean flag=true;
	    while(flag)
		{
		System.out.println("Enter choice 1.insert 2.view 3. delete");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Employee ID :");
			empId=sc.nextInt();
			System.out.println("Enter Employee Name :");
			name=sc.next();
			System.out.println("Enter Salary :");
			sal=sc.nextInt();
			EmpService  empService=new EmpService();
			int t=	empService.addEmpService(empId, name, sal);
			System.out.println("Main controller Return value is : "+t);
			break;
		
		case 2:
			EmpService  empService1=new EmpService();
			/*ArrayList t1=	empService1.viewEmpService();
			Iterator i1 =t1.iterator();
			System.out.println("Main controller Return value is : ");
		      while(i1.hasNext())
		      {
		       System.out.print(" " + i1.next()+ " ");
		      }
			//System.out.println(t1);
			System.out.println("\n");*/
			
            break;
		case 3:
			System.out.println("Enter Employee id to delete the element:");
			empId=sc.nextInt();
			EmpService  empService2=new EmpService();
			int t2=	empService2.deleteEmpService(empId);
			System.out.println("Main controller Return value is : "+t2);
		
	       break;
		
		}	
		

	}

	}

}
