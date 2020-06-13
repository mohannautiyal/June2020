package com.home.Java8;

import java.util.Arrays;

public class ArraysLambdaEx {

	public static void main(String[] args) {
	
	// Arrays using lamda
		
		int[] arr = {1,5,6,7,4,5,6};		
		Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
		
		Arrays.stream(arr).filter(x -> x>5).forEach(System.out::println);
		
		Arrays.stream(arr).map(x ->x*2).forEach(x ->System.out.print(x+" "));


	}

}
