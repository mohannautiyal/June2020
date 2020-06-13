package com.home.functionalInterface.basic;

public class Runner {

	
	static FunctionalInt functional = new FunctionalInt(){
			public void method(int x) {
				System.out.println(x + 2);
			}			
	};
	
	
	static FunctionalInt function1 = (int x)->{
		System.out.println(x + 2);
	};
	
	static FunctionalInt function2 = x -> System.out.println(x+3);
	
	public static void main(String[] args) {
		functional.method(10);
		function1.method(20);
		function2.method(30);
	}
}
