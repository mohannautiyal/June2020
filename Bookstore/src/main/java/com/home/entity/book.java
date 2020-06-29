package com.home.entity;

import lombok.Data;

@Data
public class book {
	
	String bookName;
	int cost;
	
	public book(String bookName, int cost) {
		super();
		this.bookName = bookName;
		this.cost = cost;
	}
	

}
