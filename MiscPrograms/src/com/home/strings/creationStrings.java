package com.home.strings;

public class creationStrings {

	public static void main(String[] args) {
     // Diff ways of creating a String
	//1	
     String str = new String("Madan");
     //2
     String str1 = "Madan";
     //3
     StringBuffer str2 = new StringBuffer("Madan");
     //4
     StringBuilder str3 = new StringBuilder("Madan");
     
     System.out.println(str);
     System.out.println(str1);
     System.out.println(str2);
     System.out.println(str3);
   
    String str4 = str.concat("Test");
     System.out.println(str4);
     System.out.println(str3);

     str2.append("Test");
     System.out.println(str2);
     
		
		
	}

}
