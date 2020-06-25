package com.home.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOpExample {

	public static void main(String[] args) {

		UnaryOperator<Integer> add10 = x ->x+10;
			System.out.println(add10.apply(10));
		
	}

}
