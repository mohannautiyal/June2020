package com.home.SampleAPI;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APIresponseBody {

	
	@Test
	public  void TestAPI() {

		
		RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification rs = RestAssured.given();
		Response rsp = rs.get("/Gurgaon");
		ResponseBody rsb = rsp.getBody();
		
		
		System.out.println(rsb.asString());
		
		// Using json path
		//Response interface gives you a mechanism to extract nodes based on a given JsonPath.
		//There is a method called Response.JsonPath(), which returns a io.restassured.path.json.JsonPath Object. 
		//This object can be used to further query specific parts of the Response Json.
		
		String city = rsb.jsonPath().get("City");
		System.out.println("City is " +city);
	
		System.out.println();
         
		assertTrue(rsb.asString().contains("Gurgaon"));
		
		
		
	}
	
	

}
