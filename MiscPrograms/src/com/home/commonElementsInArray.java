package com.home;

import java.util.Arrays;
import java.util.HashSet;


// Find common elements in two arrays
public class commonElementsInArray {

	public static void main(String[] args) {

		int [] arr1 = {2,5,8,9,10,12,2,5};
		int [] arr2 = {3,5,7,8,12,15,5};		
	
	    
	    HashSet<Integer> set1 = new HashSet<Integer>();
	    Arrays.stream(arr1).forEach(x -> set1.add(x));	 
	    
	    // Using lambda
	    Arrays.stream(arr2).distinct().filter(x ->set1.contains(x)).forEach( x -> System.out.print(x+" "));
        // Without lamda
	    System.out.println("\n========================");
	    for(int i=0;i<arr2.length;i++) {
	    	if(!set1.add(arr2[i]))
	    		System.out.println(arr2[i]+ " Element is present");
	    }
		
	}

}
