package com.cg.eis.service;


import java.util.HashMap;
import 	com.cg.eis.bean.EmployeeBean;
import com.cg.eis.pl.EmpDAO;
 interface EmployeeService{
	 public int addEmpService(int empId,String name,int sal);
 }
public class EmpService implements EmployeeService {
	
	public int addEmpService(int empId,String name,int sal) {
		
		String designaton="",insuranceScheme="";
		if(sal>5000&&sal<20000)
		{
			designaton="System Associate";
			insuranceScheme="Scheme C";
		}
		else if(sal>=20000&&sal<40000)
		{
			designaton="Programmer";
			insuranceScheme="Scheme B";
		}
		else if(sal>=40000)
		{
			designaton="Manager";
			insuranceScheme="Scheme A";
		}
		else
		{
			designaton="Clerk";
			insuranceScheme="No Scheme";
		}
		
		EmployeeBean empBean=new EmployeeBean();
		empBean.setName(name);
		empBean.setEmpId(empId);
		empBean.setSal(sal);
		empBean.setDesignaton(designaton);
		empBean.setInsuranceScheme(insuranceScheme);
		
		EmpDAO empDao=new EmpDAO();
		int k=empDao.addEmp(empBean);
		
		return k;
		
		
	}
	/*public HashMap viewEmpService()
	{
		EmpDAO empdao= new EmpDAO();
		HashMap myMap=empdao.viewEmp();
	}*/
	
	public int deleteEmpService(int empId) //throws SQLException, ClassNotFoundException
	{
		EmployeeBean empBean=new EmployeeBean();
	    empBean.setEmpId(empId);
		EmpDAO empdao= new EmpDAO();
	     int k = empdao.deleteEmp(empBean);
	     

		
		return k;
	}

}
