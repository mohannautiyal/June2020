package com.home.functionalInterface.basic;

import java.util.function.Function;

public class FunctionsJava8 {

	public static void main(String[] args) {

   //interface Function<T, R>
		//T – Type of the input to the function.
		//R – Type of the result of the function
		
    Function<Integer,Integer> functionAdd = (x) -> x+20;
       System.out.println(functionAdd.apply(10));
    
    
     Function<String,String> convertCase = (Str) -> Str.toUpperCase();
     System.out.println(convertCase.apply("InDia Wins"));
       
       
	}        

}
