package com.home.DesignPatterns;

public class runner {
	
	public static void main(String[] args) {
		SingleObject s1 = SingleObject.getInstance();
		SingleObject s2 = SingleObject.getInstance();
		
		System.out.println(s1==s2);
		s1.singleInstance = 10;
		System.out.println(s2.singleInstance);

		
		
	}

}
