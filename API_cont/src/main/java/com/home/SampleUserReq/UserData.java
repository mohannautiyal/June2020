package com.home.SampleUserReq;

import java.util.List;

import lombok.Data;

@Data
public class UserData {
	
	
	int Page;
	int per_page;
	int total;
	int total_pages;
	List<data> data;
	ad ad;
	
	@Data
	static class data{
		int id;
		String email;
		String first_name;
		String last_name;
		String avatar;
	}
	
	@Data
	static class ad{
		String company;
		String url;
		String text;
		
	}
	

}
