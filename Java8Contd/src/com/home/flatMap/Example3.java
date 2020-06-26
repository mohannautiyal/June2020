package com.home.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {

		
		int[] IntegerArray = {2,3,4,6,7,8};
		Stream.of(IntegerArray)
		           .flatMapToInt(x->Arrays.stream(x))
		           .forEach(x->System.out.println(x));
		
		              
	}

}
