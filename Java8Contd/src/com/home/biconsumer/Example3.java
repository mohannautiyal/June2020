package com.home.biconsumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Example3 {
	// Printing Map data using Bi Consumer
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Madan");
		map.put(2, "Ram");
		map.put(3, "Raj");
		map.put(4, "Shyam");

        BiConsumer<Integer,String> printMap = (k,v)->{
        	System.out.println(k+" "+v);
        	
        };
		
          map.forEach(printMap);
		
	}

}
