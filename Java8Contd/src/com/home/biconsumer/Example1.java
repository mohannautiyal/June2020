package com.home.biconsumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Example1 {

	        //       Biconsumer interface
	
			//It represents a function which takes in two arguments and produces a result. However these kind of functions don’t return any value.
			/*
			 * This functional interface takes in two generics, namely:-
			 * 
			 * T: denotes the type of the first input argument to the operation U: denotes
			 * the type of the second input argument to the operation
			 * The lambda expression assigned to an object of BiConsumer type is used to define its accept() which eventually applies the given operation on its arguments. 
			 */
	BiConsumer<Integer,Integer> addConsumer = (x,y)-> System.out.println("Sum is "+(x+y));
	
	// biconsumer to transfer elements of one Map to another
	static BiConsumer<HashMap<String,String>,HashMap<String,String>> MapTransfer = (map1,map2)-> {
		map1.entrySet().forEach(x -> map2.put(x.getKey(),x.getValue()));};

	public static void main(String[] args) {

		new Example1().addConsumer.accept(10, 20);

		
        HashMap<String,String> Map1 = new HashMap<String,String>();
        HashMap<String,String> Map2 = new HashMap<String,String>();
        
        Map1.put("name", "Madan");
        Map1.put("EmpId", "1234");
        
        MapTransfer.accept(Map1, Map2);
        System.out.println(Map2);
		

	}

}
