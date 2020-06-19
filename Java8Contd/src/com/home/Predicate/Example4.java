package com.home.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example4 {

	
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> oddNum = x -> (x%2!=0);
		
		List<Integer> ll1 = new ArrayList<Integer>();
		
		ll1.add(10);
		ll1.add(21);
		ll1.add(12);
		ll1.add(5);
		
		ll1.stream().filter(oddNum).forEach(x -> System.out.println(x));
		
		
	}
	
	
	
}
