package com.home.Java8;

public class Employee {

	String empName;
	int Salary;
	int empNo;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Employee(String empName, int salary, int empNo) {
		super();
		this.empName = empName;
		Salary = salary;
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", Salary=" + Salary + ", empNo=" + empNo + "]";
	}
	
	
}
