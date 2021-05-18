package com.capg.corejava.labbook.Layered_Architecture;

import java.util.HashMap;
import java.util.List;

public class EmployeeService {
	

	public HashMap addEmployeeService(int id,String name,double salary,String designation)
     {
    	 String insurancescheme="";
    	 if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate"))
    	 {
    		insurancescheme="C"; 
    	 }
    	 else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
    	 {
    		 insurancescheme="B";
    	 }
    	 else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
    	 {
    		 insurancescheme="A";
    	 }
    	 else if(salary<5000 && designation.equalsIgnoreCase("Clerk"))
    	 {
    		 insurancescheme="No";
    	 }
    	 
    	 EmployeeBean employeeBean=new EmployeeBean();
    	 employeeBean.setId(id);
    	 employeeBean.setName(name);
    	 employeeBean.setSalary(salary);
    	 employeeBean.setDesignation(designation);
    	 employeeBean.setInsurancescheme(insurancescheme);
    	 //employeeBean.setInsurancescheme(schemedetail);
    	
 		 HashMap<Integer,List> new_hmap = new HashMap<Integer,List>();
          EmployeeDAO employeedao=new EmployeeDAO();
 	  new_hmap.putAll(employeedao.addEmployee(employeeBean));
 				
 		
 		return new_hmap; 
     
     }
}
