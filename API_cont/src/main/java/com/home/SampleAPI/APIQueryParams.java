package com.home.SampleAPI;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APIQueryParams {
	
	
	
	@Test
	public void VerifyOutputWithInputContainingQueryParams() {
		
		
		//	https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=2b1fd2d7f77ccf1b7de9b441571b39b8
		
		
		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/weather";
		RequestSpecification rs = RestAssured.given().param("q", "London, UK")
				               .param("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8");
		Response response = rs.get();
		
	    String rsbody = response.getBody().asString();
	    String json = response.jsonPath().prettyPrint().toString();
	    System.out.println(json);
        assertTrue("weather Atrribute missing", json.contains("weather"));
	
	
	}

}
