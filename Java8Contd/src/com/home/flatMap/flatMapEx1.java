package com.home.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class flatMapEx1 {

	public static void main(String[] args) {
        //FlatMap Example 
		String [][] doubleArray = {{"A","Apple"},{"B","Ball"},{"C","Cat"}};
		Stream<String[]> data =Stream.of(doubleArray);
		Stream.of(doubleArray).flatMap(x -> Stream.of(x)).forEach(x->System.out.print(x+" "));

		System.out.println("\n");

		String [] array = {"mohan","rohan","sohan","raj"};
		Stream.of(array).map(x ->x.toUpperCase()).forEach(x->System.out.println(x));

		
    	}

}
