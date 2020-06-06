package com.home.authenticate;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class authentication {
	
	// Basic Authentication request
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
		RequestSpecification Request = RestAssured.given();
		
		Request.auth().basic("ToolsQA", "TestPassword");
	//s	Request.auth().oauth2(accessToken)
		Response Rs = Request.get();
		
		System.out.println(Rs.getStatusCode() +" "+Rs.getStatusLine());
		System.out.println(Rs.getBody().asString());
		
		
	}

}
