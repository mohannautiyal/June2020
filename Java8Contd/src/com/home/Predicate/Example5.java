package com.home.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Example5 {
	
	
	/*
	 * In Java 8, BiPredicate is a functional interface, which accepts two arguments
	 * and returns a boolean, basically this BiPredicate is same with the Predicate,
	 * instead, it takes 2 arguments for the test.
	 */
	
	
	// Using bipredicate to filter names with a certain length
	public static void main(String[] args) {
		
		BiPredicate<String,Integer> checkLength = (x,y)-> x.length() <=y;
		
		List<String> empNames = new ArrayList<String>();
		empNames.add("Madan");
		empNames.add("Rajesh");
		empNames.add("Suraj Kumar");
		empNames.add("laxman Singh");
		
		empNames.stream().filter(x ->checkLength.test(x, 8)).forEach(System.out::println);
		
		
		
	}

}
