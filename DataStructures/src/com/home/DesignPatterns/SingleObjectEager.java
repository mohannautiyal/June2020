package com.home.DesignPatterns;


// Eager instantiation
public class SingleObjectEager {
	
	private static SingleObjectEager singleObject = new SingleObjectEager();
	
	private SingleObjectEager() {
		
	}

	public static SingleObjectEager getInstance() {
		return singleObject;
	}
	
	
}
