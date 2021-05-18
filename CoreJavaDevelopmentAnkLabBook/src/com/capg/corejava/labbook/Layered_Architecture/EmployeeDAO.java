package com.capg.corejava.labbook.Layered_Architecture;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EmployeeDAO {
	 List empList=new ArrayList();
	
     HashMap<Integer,List> hmap = new HashMap<Integer,List>();
     //HashMap new_hmap = new HashMap();
	public HashMap addEmployee(EmployeeBean employeeBean)
	{   
		
		
		empList.add(employeeBean.getId());
		empList.add(employeeBean.getName());
		empList.add(employeeBean.getDesignation());
		empList.add(employeeBean.getSalary());
		empList.add(employeeBean.getInsurancescheme());
		//empList.add(employeeBean.getInsurancescheme());
		
		System.out.println(empList);
		
		hmap.put(employeeBean.getId(),empList);
		//System.out.println(hmap);
		//new_hmap.putAll(hmap);
		//System.out.println(new_hmap);
		
		
		return hmap ;
		
		
		
		
	}
	
	
	}

	

