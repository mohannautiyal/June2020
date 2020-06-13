package com.home.post;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;

import com.hom.excelPOI.ExcelUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePostReq {

	//https://gorest.co.in/
	public static void main(String[] args) throws IOException {

		RestAssured.baseURI = "https://gorest.co.in";
		
		JSONObject json = new JSONObject();
		
		ExcelUtil excel = new ExcelUtil("Dummy.xlsx","APIData");
		List<HashMap<String,String>> exceldata = excel.ReadExcel();
		
		//json.putAll(exceldata.get(0));
		json.putAll(exceldata.get(1));
		
		/*
		 * json.put("first_name", "Manojx"); json.put("last_name", "ZZKumar");
		 * json.put("gender", "male"); json.put("email", "manojzzkumar@gmail.com");
		 * json.put("status", "active");
		 */
		System.out.println(json.toString());
		RequestSpecification Request = RestAssured.given()
				         .header("Accept","application/json")
				         .header("Content-Type","application/json")
				         .header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL")
				         .body(json.toString());
		
		
		

		Response response =Request.post("/public-api/users");
	     System.out.println(response.getBody().jsonPath().getString("_meta"));
				
		

		RequestSpecification Request1 = RestAssured.given()
				.header("Authorization","Bearer x7WAghTGiZcymPxJprRUloL4JKL_ta0-MjAL")
				     .queryParam("first_name", "Mohan");
		Response response1 =Request1.get("/public-api/users");
		//response1.getBody().prettyPrint();
		
		goPostObj Users =response1.getBody().as(goPostObj.class);
		Users.getResult().stream().forEach(x -> System.out.println(x.getFirst_name()+ " "+x.last_name))
		                   ;
		
		
		


		
	}

}
