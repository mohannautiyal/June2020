package com.home.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.home.entity.book;

public class shoppingCart {

	List<book> itemsInCart = new ArrayList<book>();

	public void addBook(book book) {
		itemsInCart.add(book);
	}

	public void checkout() {
		if (itemsInCart.size() == 0)
			System.out.println("You can't checkout an empty cart !");
		else {

			int totalcost = itemsInCart.stream().mapToInt(x -> x.getCost()).sum();

			System.out.println("Total cost is " + totalcost);

		}
		;
	}

}
