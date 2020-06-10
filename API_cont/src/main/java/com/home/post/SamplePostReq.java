package com.home.post;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class SamplePostReq {

	//https://gorest.co.in/
	public static void main(String[] args) {

		RestAssured.baseURI = "https://gorest.co.in/public-api/users";
		RequestSpecification Request = RestAssured.given()
				         .header("Accept","application/json")
				         .header("Content-Type","application/json");
				        
	
		
		
		


		
	}

}
