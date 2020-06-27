package com.home.bdd;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

public class StepDefFile {

	
	@Given("two number {int} and {int}")
	public void two_number_and(Integer int1, Integer int2, DataTable operations) {

		System.out.println("Sum is " + (int1 + int2)+ " "+operations.cell(0, 1) );
		
	}

	
	
	@DataTableType
	public List<String> Operations(List<String> operations) {
		return operations;
	}
	
	
}
