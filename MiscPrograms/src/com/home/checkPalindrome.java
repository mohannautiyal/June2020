package com.home;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {

		// check if a string is a palindrome using recursion

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");

		String inputString = sc.nextLine();

		//checkStringIsPalindrome(inputString);
	String str=	checkStringIsPalindromeUsingRecursion(inputString);
	System.out.println(str);
	}

	public static void checkStringIsPalindrome(String inputString) {

		String revStr = "";
		int length = inputString.length();

		for (int i = length - 1; i >= 0; i--) {
			revStr = revStr + inputString.charAt(i);

		}

		if (revStr.toUpperCase().equals(inputString.toUpperCase()))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}
	
	
	public static String checkStringIsPalindromeUsingRecursion(String inputString) {
		int l = inputString.length();
		if (inputString.charAt(l-1) ==inputString.charAt(0) )
			return "";
		
		return checkStringIsPalindromeUsingRecursion(inputString.substring(1,l-1));

	}

}
