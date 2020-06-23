package com.home.binaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorEx1 {
	/*
	 * Represents an operation upon two operands of the same type, producing a
	 * result of the same type as the operands. This is a specialization of
	 * BiFunction for the case where the operands and the result are all of the same
	 * type.
	 * 
	 * Binary Operator vs BiFunction input and output remains same for Binary Operator
	 */	
	public static void main(String[] args) {

		BinaryOperator<Integer> addTwo = (x,y)-> x+y;
		Function<Integer,Integer> multiplyTwo =x -> x*10;
		
		int sumMul = addTwo.andThen(multiplyTwo).apply(10, 30);
		System.out.println(sumMul);
		
		
		
	}

}
