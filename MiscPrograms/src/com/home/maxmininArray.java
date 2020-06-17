package com.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class maxmininArray {

	// Find Max and min of an array using collections
	public static void main(String[] args) {
      
		int arr[] = {22,42,11,55,67,11};
		
		List numbersList = new ArrayList<Integer>();		
		Arrays.stream(arr).forEach(x -> numbersList.add(x));		
		System.out.println(numbersList);
		
		
		
		  Set<Integer> sortedList = new TreeSet<Integer>(numbersList);
		  numbersList.removeAll(numbersList);
		  numbersList.addAll(sortedList);
		  System.out.println("Max element is "+numbersList.get(numbersList.size()-1));
		  System.out.println("Minimum element is "+numbersList.get(0));


		//  sortedList.forEach(x->System.out.print(x+" "));
		 
		
	}

}
