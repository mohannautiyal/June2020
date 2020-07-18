package com.home.SampleAPI;

import com.github.javafaker.Faker;

public class FakerLib {

	// library to create fake data
	public static void main(String[] args) {

    Faker fakeData = new Faker();
     String firstName = fakeData.name().firstName();
     String LastName = fakeData.name().lastName();
     
     
     System.out.println("Name is "+firstName+" "+ LastName);
	}

}
