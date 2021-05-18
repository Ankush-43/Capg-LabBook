package com.cg.eis.pl;
import 	com.cg.eis.bean.EmployeeBean;
import java.util.HashMap;
public class EmpDAO {

	public int addEmp(EmployeeBean empBean) {
		
		HashMap myMap=new HashMap();
		myMap.put(empBean.getEmpId(), empBean.getName());
		return 1;
	}
	/*public HasMap viewEmp() {
		
	}*/
	public int deleteEmp(EmployeeBean empBean) {
		
		HashMap myMap=new HashMap();
		myMap.remove(empBean.getEmpId());
		
		return 1;
	}
}