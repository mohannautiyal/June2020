package com.home.functionalInterface.basic;

public class Runner2 {
	
	public static void main(String[] args) {
		
		FunctionIntTwoArgs Function1 = (x,y)-> (x + y);
		int sum = Function1.add(10, 20);
		System.out.println(sum);
	}

}
