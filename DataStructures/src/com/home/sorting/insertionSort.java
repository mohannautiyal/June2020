package com.home.sorting;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {

		int num[] = { 15, 52, 34, 12, 9, 1 };
		int sortedArray[] = insertionSortArray(num);
		System.out.println(Arrays.toString(sortedArray));

	}

// Insertion sort
	public static int[] insertionSortArray(int num[]) {

		int l = num.length;

		int tempVal = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] < num[j]) {
					tempVal = num[i];
					for (int k = i; k > j; k--) {
						num[k] = num[k - 1];

					}
					num[j] = tempVal;
				}

			}

		}
		return num;

	}

}
