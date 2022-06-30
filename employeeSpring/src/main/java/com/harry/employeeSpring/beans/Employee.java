//Use Case ----> 2

package com.harry.employeeSpring.beans;

public class Employee {
	

	String empName;
	int empSal;
	String empRole;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Employee(String empName, int empSal, String empRole) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.empRole = empRole;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + ", empRole=" + empRole + ", getEmpName()="
				+ getEmpName() + ", getEmpSal()=" + getEmpSal() + ", getEmpRole()=" + getEmpRole() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
