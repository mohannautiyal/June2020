package com.home.strings;

public class employee implements Cloneable{
	
	String empName;
	int empId;

	
	public employee clone() throws CloneNotSupportedException {
		return (employee) super.clone();
	}
	
	
	public String toString() {
		
		return "EmpName " +empName +" empId "+empId;
	}
	
	
}
