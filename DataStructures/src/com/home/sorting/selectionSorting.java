package com.home.sorting;

import java.util.Arrays;

public class selectionSorting {

	public static void main(String[] args) {

		int num[] = { 12, 4, 5, 78, 11, 0, 8, 11, 13,1 };
		int sortedArr[] = selectionSort(num);

		System.out.println(Arrays.toString(sortedArr));

	}

	// Selection sort algorithm
	public static int[] selectionSort(int num[]) {
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			int min = i;

			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}

			}

			temp = num[min];
			num[min] = num[i];
			num[i] = temp;

		}
		return num;
	}
}
