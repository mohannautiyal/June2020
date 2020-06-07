package com.home.sampleAPIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class covid19DataByCountry {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://covid-19-data.p.rapidapi.com";
		RequestSpecification Request = RestAssured.given()
				.header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
				.header("x-rapidapi-key", "d59deb7514msh20ff016bfa60108p1b504ejsnb8bc756bba53")
				.queryParam("date-format", "YYYY-MM-DD")
				.queryParam("format", "json")
				.queryParam("date", "2020-06-05")
				.queryParam("name", "India");
		
		Response response = Request.get("/report/country/name");
		response.getBody().prettyPrint();
		
	}

}
