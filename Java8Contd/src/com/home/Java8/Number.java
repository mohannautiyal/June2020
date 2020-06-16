package com.home.Java8;

import java.util.function.Consumer;

public class Number {

	
	//Consumer using method reference
	//clubbig multiple cosumers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> addTen = Number::addNumber;
		Consumer<Integer> multiplyTen = Number::multiplyNUmber;
		addTen.andThen(multiplyTen).accept(10);
		addTen.accept(100);

	}
	
	
	
	public static void addNumber(int a) {
		System.out.print((a+10) +" ");
	}
	
	public static void multiplyNUmber(int a) {
		System.out.print((a *10)+" ");
	}

}
