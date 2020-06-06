package com.home.sampleAPIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getNewsAPI {

	public static void main(String[] args) {

	    //https://newsapi.org/s/india-news-api
		//http://newsapi.org/v2/top-headlines?country=in&apiKey=API_KEY

		
		RestAssured.baseURI = "http://newsapi.org/v2/top-headlines";
		RequestSpecification Request = RestAssured.given()
				      .queryParam("country", "in")
				      .queryParam("apiKey", "7de10fb43aba4fd6b917733f52beac52");
		
		
		Response response = Request.get();
		
		// Deserialize Json response here to Pojo object
		NewsArticles newsDetails = response.getBody().as(NewsArticles.class);
		
		//System.out.println(response.getBody().jsonPath().prettify());
		
		System.out.println("=============================== ALL NEWS HEADLINES ============================================================");

		// Using lambda Expression to print only source and description data		
		newsDetails.getArticles().stream().map(x -> x.getSource().getName() + " : " + x.description).
		                  forEach(x -> System.out.println(x));
		
		System.out.println("=============================== TIMES OF INDIA NEWS =====================================================================");
		// Using lambda Expression to print only "Times of India News"	
		
				newsDetails.getArticles().stream().filter( x -> x.getSource().getName().equals("The Times of India")).				      
				map(x -> x.getSource().getName() + " : " + x.description).forEach(x -> System.out.println(x));
		
		System.out.println("=============================== SORTED NEWS =====================================================================");

				newsDetails.getArticles().stream().map(x -> x.getSource().getName() + " : " + x.description)
				.sorted().forEach(x -> System.out.println(x));
				
				
	}

}
