package com.home.shoppingcart;

import com.home.entity.book;

public class TestClass {
	
	public static void main(String[] args) {
		
		
		shoppingCart cart = new shoppingCart();
		cart.checkout();

		cart.addBook(new book("Effective Java",40));
		cart.addBook(new book("Clean Code",60));
		cart.addBook(new book("Head First Java",30));

		cart.checkout();
	}

}
