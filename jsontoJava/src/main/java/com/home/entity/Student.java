package com.home.entity;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	
	String name;
	String rollno;
	List<Subject> subjects;
	
	
	

}
