package com.home;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// Reverse String using recursion

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");

		String inputString = sc.nextLine();
		String revString = reverseInputString(inputString);
		System.out.println(revString);
	}

	public static String reverseInputString(String inputString) {

		int l = inputString.length();
		if (l == 0)
			return "";
		l--;
		
		return inputString.charAt(l) + reverseInputString(inputString.substring(0, l));

	}

}
