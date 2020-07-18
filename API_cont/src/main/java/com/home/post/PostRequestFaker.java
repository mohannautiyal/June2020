package com.home.post;

import org.json.simple.JSONObject;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


// Post Request using Faker
public class PostRequestFaker {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://gorest.co.in";
		
		RequestSpecification request = RestAssured.given()
				 .header("Accept","application/json")
		         .header("Content-Type","application/json")
		         .header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL");
		JSONObject UserData = new JSONObject();
		Faker fakeUser = new Faker();
		String firstName = fakeUser.name().firstName();

		UserData.put("last_name", fakeUser.name().lastName());
		UserData.put("gender","male");
		UserData.put("first_name", firstName);
		UserData.put("email", firstName+"@gmail.com");
		UserData.put("status", "active");
		Response reponse = request.body(UserData.toString()).post("/public-api/users");
		reponse.getBody().prettyPrint();
		RequestSpecification Request1 = RestAssured.given()
				.header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL")
				     .queryParam("first_name", firstName);
		Response response1 =Request1.get("/public-api/users");
		//response1.getBody().prettyPrint();
		
		goPostObj Users =response1.getBody().as(goPostObj.class);
		Users.getResult().stream().forEach(x -> System.out.println(x.getFirst_name()+ " "+x.last_name))
		                   ;
		
		
	}

}
