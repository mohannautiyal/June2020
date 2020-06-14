package com.home.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ConsumerInterface  {

	//Consumer interface represents an operation that accepts a single input argument and returns no result.


		
		public static void main(String[] args) {
			
			//
			Consumer<Integer> calculate = t -> System.out.println(t * 10);
			calculate.accept(10);
			
			//
			List<Integer> l1 = Arrays.asList(12,13,14);
			Consumer<List<Integer>> multiply = list -> {
				for(int i = 0;i<list.size();i++) {
					System.out.print(list.get(i)* 10);
					System.out.print(" ");
				}
			};
			
			Consumer<List<Integer>> multiplyLamda = list -> list.stream().forEach(a -> System.out.print((a * 10) + " ")); 
			multiply.accept(l1);
			System.out.println();
			multiplyLamda.accept(l1);
			
			System.out.println("\n====================");
			// For each takes consumer as an argument
			Consumer<Integer> consumer = x -> System.out.println(x +10) ;
			l1.forEach(consumer);
			
			// Add list to anothe set using Consumer
			Set<Integer> set = new HashSet<Integer>();
			Consumer<Integer> addToSet = x -> set.add(x);
			l1.forEach(addToSet);
			System.out.println("\n====================");

			set.forEach(System.out::println);
			
		}


}
