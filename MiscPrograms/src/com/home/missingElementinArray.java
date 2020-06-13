package com.home;

import java.util.Arrays;

public class missingElementinArray {

	// Find missing element in an array
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,10,11,12,13};
		int noOfElem = arr.length +1;
		int ExpectedSum = noOfElem * (noOfElem+1)/2;
		int ActualSum =Arrays.stream(arr).sum();
		int missingElement = ExpectedSum - ActualSum;
		System.out.println("Missing Element is " + missingElement);
		 
	}

}
