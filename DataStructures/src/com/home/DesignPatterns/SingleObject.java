package com.home.DesignPatterns;


// Lazy instantiation
public class SingleObject {

	private static SingleObject singleObject;
    public int singleInstance; 
    
	private SingleObject() {

	}

	public static SingleObject getInstance() {

		if (singleObject == null)
			singleObject = new SingleObject();

		return singleObject;

	}
	
	
	
	

}
