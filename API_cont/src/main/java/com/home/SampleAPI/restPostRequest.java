package com.home.SampleAPI;

import static org.junit.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restPostRequest {

	// POST request usually result in changes on the Server like the addition of new
	// data
	// or maybe updated to existing data.

	// The data that is sent to the server in a POST request is sent in the body of
	// the HTTP request.
	// The type of body, XML, JSON or some other format is defined by the
	// Content-Type header.
	// If a POST request contains JSON data then the Content-Type header will have a
	// value of application/json.
	// Similarly, for a POST request containing XML the Content-Type header value
	// will be application/xml.

	// http://restapi.demoqa.com/customer/register

	@Test
	public void verifyPostReq() {

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		JSONObject reqParam= new JSONObject();
		reqParam.put("FirstName", "Mohan");
		reqParam.put("LastName", "Lal");
		reqParam.put("UserName", "mlal");
		reqParam.put("Password", "Test");
		reqParam.put("Email", "mlalTest@gmail.com");

		RequestSpecification rs = RestAssured.given();
		rs.body(reqParam.toJSONString());
		Response rsp = rs.post("/register");
		int status = rsp.statusCode();
		String rspbody = rsp.getStatusLine();
		System.out.println(status +" "+rspbody );
		assertTrue( status==200);

	}

}
