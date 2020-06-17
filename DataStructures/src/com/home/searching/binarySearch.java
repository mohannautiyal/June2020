package com.home.searching;


// Searching a number using binary search
public class binarySearch {

	public static void main(String[] args) {

		int sortedarr[] = { 22, 45, 67, 89, 99, 200 };
		binarySearchMethod(99, sortedarr);
	}

	public static void binarySearchMethod(int number, int[] sortedarr) {

		int lastIndex = sortedarr.length - 1;
		int firstIndex = 0;
		int midIndex = 0;
		while (lastIndex >= firstIndex) {
			midIndex = (firstIndex + lastIndex) / 2;
			if (number == sortedarr[midIndex]) {
				System.out.println(sortedarr[midIndex] + " number is present at index " + midIndex);
				break;
			} else if (number > sortedarr[midIndex]) {
				firstIndex = midIndex + 1;

			} else {
				lastIndex = midIndex - 1;
			}
		}

	}

}
