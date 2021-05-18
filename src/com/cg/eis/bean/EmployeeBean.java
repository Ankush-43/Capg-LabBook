package com.cg.eis.bean;
import java.io.Serializable;
public class EmployeeBean implements  Serializable{
	
	private int empId;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesignaton() {
		return designaton;
	}
	public void setDesignaton(String designaton) {
		this.designaton = designaton;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	private int sal;
	private String designaton;
	private String insuranceScheme;

}
