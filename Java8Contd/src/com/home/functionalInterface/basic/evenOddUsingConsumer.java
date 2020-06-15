package com.home.functionalInterface.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class evenOddUsingConsumer {

	static List even = new ArrayList<Integer>();
	static List odd = new ArrayList<Integer>();

	static Consumer<List<Integer>> EvenOdd = IntegerList -> {
		IntegerList.forEach(x ->{
			if(x%2==0)
				even.add(x);
			else
				odd.add(x);
			
		});

	};

	public static void main(String[] args) {
		List numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);

		
		EvenOdd.accept(numbers);
		 
		 even.forEach(x->System.out.print(x+ " "));
		 System.out.println("\n ======================= ");
		 odd.forEach(x->System.out.print(x+" "));
	}

}
