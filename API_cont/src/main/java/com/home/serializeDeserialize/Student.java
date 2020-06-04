package com.home.serializeDeserialize;

import java.io.Serializable;

public class Student implements Serializable{

	
	String studentName;
	int rollnumber;

	public Student(String studentName, int rollnumber) {
		super();
		this.studentName = studentName;
		this.rollnumber = rollnumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollnumber=" + rollnumber + "]";
	}

	
	
	
	
	
}
