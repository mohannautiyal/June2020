package com.home.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class VerifyAssertions {
	
	SoftAssert softAssert = new SoftAssert();
	// Hard Annotations
	
	@Test
	public void HardAssert_TestMathemathic_Operations() {
		
		int a = 10; 
		int b = 20;
		System.out.println("Executing Sum Operation");
		assertTrue("Sum is incorrect", (a + b) ==10);
		System.out.println("Executing Multiply Operation");
		assertTrue("Multiplication is incorrect", (a * b) ==200);
		System.out.println("Executing Diff Operation");
		assertTrue("Diff is incorrect", (a - b) ==-10);

	}
	
	// Soft Assert
	@Test
	public void SoftAssert_TestMathemathic_Operations() {
		System.out.println("======================================");
		int a = 10; 
		int b = 20;
		System.out.println("Executing Sum Operation");
		softAssert.assertEquals(a+b, 30, "Sum is incorrect");
		System.out.println("Executing Multiply Operation");
		softAssert.assertEquals(a*b, 10, "Multiplication is incorrect");
		System.out.println("Executing Diff Operation");
		softAssert.assertEquals(a-b, -20, "Diff is incorrect");
		
		softAssert.assertAll();
		
	}
	

}
