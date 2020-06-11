package com.home.post;

import lombok.Data;

@Data
public class _meta {
	
	public String success;
	public String code;
	public String message;
	public int totalCount;
	public int pageCount;
	public int currentPage;
	public int perPage;
	public rateLimit rateLimit;
	
	


}
