package com.home.SampleUserReq;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getUserData {
	
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request = RestAssured.given()
				.queryParam("page", 2);
		
		Response response = request.get("/api/users/");
		
		UserData userdata =response.getBody().as(UserData.class);
		System.out.println("List of Users is as below :");
		userdata.getData().stream().forEach(user->System.out.println(user.getFirst_name()));
	}

}
