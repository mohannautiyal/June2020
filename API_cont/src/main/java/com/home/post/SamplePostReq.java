package com.home.post;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePostReq {

	//https://gorest.co.in/
	public static void main(String[] args) {

		RestAssured.baseURI = "https://gorest.co.in";
		
		JSONObject json = new JSONObject();
		json.put("first_name", "Raj");
		json.put("last_name", "ZZKumar");
		json.put("gender", "male");
		json.put("email", "rajzzkumar@gmail.com");
		json.put("status", "active");
		RequestSpecification Request = RestAssured.given()
				         .header("Accept","application/json")
				         .header("Content-Type","application/json")
				         .header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL")
				         .body(json.toString());
		
		
		

		Response response =Request.post("/public-api/users");
	     String str =   response.getBody().jsonPath().getString("$_meta");
			System.out.println(str);	
		

		RequestSpecification Request1 = RestAssured.given()
				.header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL")
				     .queryParam("first_name", "Raj");
		Response response1 =Request1.get("/public-api/users");
		//response1.getBody().prettyPrint();
		goPostObj Users =response1.getBody().as(goPostObj.class);
		Users.getResult().stream().forEach(x -> System.out.println(x.getFirst_name()+ " "+x.last_name))
		                   ;
		
		
		


		
	}

}
