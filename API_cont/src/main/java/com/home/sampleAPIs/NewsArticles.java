package com.home.sampleAPIs;

import java.util.List;

import lombok.Data;

@Data
public class NewsArticles {

	public String status;
	public int totalResults;
	public List<articles> articles;

	
	

}
