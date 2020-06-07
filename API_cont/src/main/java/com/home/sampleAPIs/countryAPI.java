package com.home.sampleAPIs;

import java.util.List;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class countryAPI {

	public static void main(String[] args) {

          RestAssured.baseURI ="https://restcountries-v1.p.rapidapi.com";

          JSONObject headerParam = new JSONObject();
          headerParam.put("x-rapidapi-host", "restcountries-v1.p.rapidapi.com");
          headerParam.put("x-rapidapi-key", "d59deb7514msh20ff016bfa60108p1b504ejsnb8bc756bba53");
          headerParam.put("useQueryString",true);

          RequestSpecification Request = RestAssured.given().headers(headerParam);
          Response response = Request.get("/all");
         // response.getBody().prettyPrint();
       
       //   response.getBody().jsonPath().getList($.toplevelDomain);
		
	}

}
