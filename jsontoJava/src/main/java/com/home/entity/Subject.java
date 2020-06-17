package com.home.entity;

import lombok.Data;

@Data
public class Subject {
	
	String subjectName;
	int marks;
	public Subject(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

}
