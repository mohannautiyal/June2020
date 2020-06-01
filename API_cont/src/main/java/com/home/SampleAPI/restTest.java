package com.home.SampleAPI;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restTest {

	public static void main(String[] args) {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification request = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response rs = request.get("/Gurgaon");

		System.out.println("Response status " + rs.getStatusCode() + " " + rs.getStatusLine());
		System.out.println(rs.getBody().asString());
		
		
		// Printing all the headers
		Headers headers = rs.getHeaders();
		List<Header> lh = headers.asList();
		lh.stream().forEach(System.out::println);
	}

}
