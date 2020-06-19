package com.home.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Subject {
	@JsonProperty("subject_name")
	String subjectName;
	int marks;
	public Subject(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

}
