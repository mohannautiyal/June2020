package com.home.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

	
	/*
	 * The map() function is a method in the Stream class that represents a
	 * functional programming concept. In simple words, the map() is used to
	 * transform one object into other by applying a function.
	 */
	public static void main(String[] args) {

		List<Integer> Integers = Arrays.asList(4,6,8,9);
		Integers.stream().map(x ->x+10).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		
	}

}
