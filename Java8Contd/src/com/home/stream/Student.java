package com.home.stream;

public class Student {
	
	String studentName;
	int rollno;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String studentName, int rollno) {
		super();
		this.studentName = studentName;
		this.rollno = rollno;
	}
	
	
	

}
