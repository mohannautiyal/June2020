package com.home.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

	/*
	 * 
	 * In Java 8, Predicate is a functional interface, which accepts an argument and
	 * returns a boolean. Usually, it used to apply in a filter for a collection of
	 * objects.
	 */
	public static void main(String[] args) {

     Predicate<String> notNull = x -> x!=null;
     
     List<String> student = new ArrayList<String>();
     student.add(null);
     student.add("Mohan");
     student.add("Rohan");
     student.add(null);

     System.out.println(student);
     System.out.println(" Non Null Values are as below");
     student.stream().filter(notNull).forEach(System.out::println);

		
		
	}

}
