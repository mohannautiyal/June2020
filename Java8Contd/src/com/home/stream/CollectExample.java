package com.home.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
    List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Mohan",123));
		studentList.add(new Student("Rohan",223));
		studentList.add(new Student("Sohan",323));
		studentList.add(new Student("Kirti",342));
		studentList.add(new Student("Raj",129));
		
		
	List<Student> rStudents=	studentList.stream().filter(stu->stu.getStudentName().startsWith("R")).collect(Collectors.toList());
		rStudents.stream().forEach(stu->System.out.println(stu.getStudentName()));
	
	Set<Student> rollNoStu =studentList.stream().filter(stu->stu.getRollno()>200).collect(Collectors.toSet());
	rollNoStu.stream().forEach(stu->System.out.println(stu.getStudentName()+"  "+stu.getRollno()));
	
	}

}
