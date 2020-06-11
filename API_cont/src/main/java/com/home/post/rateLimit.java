package com.home.post;

import lombok.Data;

@Data
public class rateLimit {
	
	public int limit;
	public int remaining;
	public int reset;

}
