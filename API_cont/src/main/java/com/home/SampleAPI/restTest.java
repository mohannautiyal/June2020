package com.home.SampleAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restTest {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification request = RestAssured.given();
		Response rs = request.get("/Gurgaon");
		
		System.out.println("Response status "+rs.getStatusCode() +" " +rs.getStatusLine());
		System.out.println(rs.getBody().asString());
		
		
	}

}
