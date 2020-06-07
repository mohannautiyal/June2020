package com.home.sampleAPIs;

import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class covid19API {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

        RestAssured.baseURI = "https://covid-19-data.p.rapidapi.com";
        RequestSpecification Request = RestAssured.given();
        Request.headers("x-rapidapi-host", "covid-19-data.p.rapidapi.com","x-rapidapi-key", "d59deb7514msh20ff016bfa60108p1b504ejsnb8bc756bba53");
		Request.queryParam("format", "json");
        Response response = Request.get("/help/countries");
       // response.getBody().prettyPrint();
        country[] cntry = response.getBody().as(country[].class);
       // Countries c =  response.getBody().as(Countries.class);
      
        for(int i = 0; i<cntry.length;i++) {
        	System.out.println(cntry[i]);
        }
        
       
	}

}
