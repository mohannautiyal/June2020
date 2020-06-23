package com.home.supplier;

import java.util.function.Supplier;

public class supplierMethodRef {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		Supplier<String> HelloJava8 =  helloWorld::Hello;
		
		Supplier<String> WelcomeJava8 =  HelloWorld::Welcome;
		
		HelloJava8.get();
		WelcomeJava8.get();
		

	}
	
	
	

}


class HelloWorld{
	
	
	public String Hello() {
		System.out.println("Hello World!");
		return "Hello World!";
	}
	
	
	public static String Welcome() {
		System.out.println("Welcome to Java 8");
		return "Welcome to Java 8";
		
	}
	
}