package com.home.sampleAPIs;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Country1 {

	private String name;
	 List<String> topLevelDomain = new ArrayList<String>();
	 private String alpha2Code;
	 private String alpha3Code;
	 ArrayList <String> callingCodes = new ArrayList<String>();
	 private String capital;
	 ArrayList<String> altSpellings = new ArrayList<String>();
	 private String region;
	 private String subregion;
	 private float population;
	 ArrayList<String>  latlng =  new ArrayList<String>();
	 private String demonym;
	 private float area;
	 private float gini;
	 ArrayList<String>  timezones = new ArrayList<String>();
	 ArrayList<String>  borders = new ArrayList<String>();
	 private String nativeName;
	 private String numericCode;
	 ArrayList<String>  currencies = new ArrayList<String>();
	 ArrayList<String>  languages = new ArrayList<String>();
	 Translations TranslationsObject;
	 private String relevance;
	
	
	
}
