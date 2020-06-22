package com.home.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchAnyMatchExample1 {

	
	// All Match //Any Match // none Match
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Mohan",123));
		studentList.add(new Student("Rohan",223));
		studentList.add(new Student("Sohan",323));
		studentList.add(new Student("Kirti",342));
		studentList.add(new Student("Raj",129));
		// All Match 
		Predicate<Student> checkRollNo = s -> s.getRollno()>123;
		boolean rollAllMatch =studentList.stream().allMatch(checkRollNo);
		System.out.println("Is Roll No > 123 "+rollAllMatch);
		//Any Match
		boolean rollAnyMatch =studentList.stream().anyMatch(checkRollNo);
		System.out.println("Is Any Roll No > 123 "+rollAnyMatch);

		
		boolean startswith = studentList.stream().anyMatch(stu -> stu.getStudentName().startsWith("T"));
        System.out.println("Starts with "+startswith);
        
        Predicate<Student> noneMatchPredicate = stu -> stu.getStudentName().equals("Mohan") && stu.getRollno()==124;
     // none Match
        boolean nonMatch =studentList.stream().noneMatch(noneMatchPredicate);
        System.out.println("No Match "+nonMatch);
        
	}

}
