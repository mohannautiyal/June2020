package com.home.sampleAPIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getTwitterAPI {
	
	
	
	public static void main(String[] args) {
		
		RestAssured.baseURI ="https://api.twitter.com";
		
		RequestSpecification Request = RestAssured.given().queryParam("id", "1234");
		
		Response response = Request.get("/1.1/statuses/show.json");
		
		System.out.println(response.getBody().asString());
		
		
	}

}
