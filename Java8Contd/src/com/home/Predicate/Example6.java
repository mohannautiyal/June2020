package com.home.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Example6 {

	public static void main(String[] args) {

		BiPredicate<String, Integer> checkMarks = (x, y) -> {
			if (y > 40) {
				System.out.println(x + " has Passed");
				return true;
			}

			else {
				System.out.println(x + " has Failed");
				return false;
			}
		};
		
		
		Employee emp1 = new Employee("Madan",55);
		Employee emp2 = new Employee("Rohan",15);
		Employee emp3 = new Employee("Rajesh",30);
		Employee emp4 = new Employee("Kanwal",35);
		
		List<Employee> empData = new ArrayList<Employee>();
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);

		
		empData.stream().filter(x -> checkMarks.test(x.getEmpName(), x.getTotalMarks()))
		.forEach(x -> System.out.println());

	}
	
	
	
	

}

class Employee {

	private String empName;
	private int TotalMarks;

	public Employee(String empName, int totalMarks) {
		super();
		this.empName = empName;
		TotalMarks = totalMarks;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getTotalMarks() {
		return TotalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}

}