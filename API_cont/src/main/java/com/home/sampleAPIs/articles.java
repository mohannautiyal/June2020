package com.home.sampleAPIs;

import lombok.Data;

@Data
// Using Lombok to generate Getter and Setters
public class articles {
	
	public String author;
	public String title;
	public String description;
	public String url;
	public String urlToImage;
	public String publishedAt;
	public String content;
	public source source;
	
	

}
