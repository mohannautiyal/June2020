package com.home.sorting;

import java.util.Arrays;

public class bubbleSorting {
	public static void main(String[] args) {

		int num[] = { 36, 19, 29, 12, 5 };
        
        int sorted[] = bubbleSortMethod(num);
        System.out.print(Arrays.toString(sorted));
	}

	
	public static int[] bubbleSortMethod(int[] numbers) {

		int l = numbers.length;
		int temp = 0;
		boolean changeFlag = true;
		int round = 0;


		for(int j=0;j<l-1;j++) {
			round ++;
			System.out.println("Round number " + round);
			changeFlag = false;
			for (int i = 0; i < l-1-j; i++) {
                 if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					changeFlag = true;
					System.out.println(Arrays.toString(numbers));
				}else
					System.out.println(Arrays.toString(numbers));

			}
			
			if(changeFlag == false)
				break;
		}
	
		System.out.println("Number of rounds "+round);
		return numbers;
	}
}
