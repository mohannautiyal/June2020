package com.home.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class supplierEx {

	
	//Supplier is a functional interface; it takes no arguments and returns a result.	
	//The lambda expression assigned to an object of Supplier type is used to define its get()
	//which eventually produces a value. Suppliers are useful when we don’t need to supply any value 
	//and obtain a result at the same time.
	public static void main(String[] args) {

		Supplier<LocalDateTime> s = ()->LocalDateTime.now();
		System.out.println("Current Time is " + s.get());
		
		Supplier<Double> randomValue = () -> Math.random() *1000;
		System.out.println(randomValue.get());
		
		Supplier<String> hello = () ->"Hello World";
		System.out.println("Madan "+hello.get());
		
	}

}
