package com.home.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapEx {

	public static void main(String[] args) {
 
		List<Integer> ll1 = Arrays.asList(2,4,5,6,7);
		List<Integer> ll2 = Arrays.asList(8,9,10,11,12);
		
		List<List<Integer>> ListOfList = new ArrayList<List<Integer>>();
		ListOfList.add(ll1);
		ListOfList.add(ll2);
		System.out.println(ListOfList);
	
		// Merging two lists using Flat Map
	    List<Integer>  SingleList =	ListOfList.stream().flatMap(l ->l.stream()).collect(Collectors.toList());
	    System.out.println(SingleList);
		
	}

}
