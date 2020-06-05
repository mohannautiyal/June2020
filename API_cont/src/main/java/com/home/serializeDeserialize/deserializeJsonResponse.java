package com.home.serializeDeserialize;

import static org.junit.Assert.assertTrue;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class deserializeJsonResponse {
	
	// Deserialize a JSON into Java Object
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject reqParam= new JSONObject();
		reqParam.put("FirstName", "M2311dan");
		reqParam.put("LastName", "Lal");
		reqParam.put("UserName", "ml3211111al");
		reqParam.put("Password", "Test");
		reqParam.put("Email", "ml13a11lTest@gmail.com");

		request.relaxedHTTPSValidation();
		request.body(reqParam.toJSONString());
		Response response = request.post("/register");
		String resp = response.getBody().asString();
		System.out.println(resp);
		RegistrationResp RegisterObj = response.getBody().as(RegistrationResp.class);
		System.out.println(RegisterObj.Message +" "+RegisterObj.SuccessCode);
	}
	

}
