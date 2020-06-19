package com.home.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Example2 {

	public static void main(String[] args) {

		List<Integer> List1 = new ArrayList<Integer>();
		List<Integer> List2 = new ArrayList<Integer>();
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);
		List1.add(6);
		
		BiConsumer<List<Integer>,List<Integer>> EvenOdd = (ll1,ll2) -> {
			ll1.stream().filter(x -> x%2==0).forEach(x -> ll2.add(x));			
		};

		EvenOdd.accept(List1,List2);
		System.out.println(List2);
		
		
	}

}
