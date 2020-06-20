package com.home.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Implementation of Consumer Java 8
public class ConsumerEmpTest {
	
	
	static Consumer<Employee> empName = x -> {
		x.setEmpName(x.getEmpName().toUpperCase());
	};
	
	static Consumer<Employee> hikeSalary = x->{
		x.setSalary(x.getSalary()+1000);
	};
	
	
	// Consumer if input as list
	static Consumer<List<Employee>> empNameToLower = x -> {
		for(Employee emp:x) {
			emp.setEmpName((emp.getEmpName().toLowerCase()));
			
		}
		
	};
	
	
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Madan",1000,12));
		employees.add(new Employee("Amit",3000,32));
		employees.add(new Employee("Raj",5000,42));
		
		employees.forEach(empName);
		employees.forEach(hikeSalary);
		employees.forEach(x -> System.out.println(x));
        
		empNameToLower.accept(employees);
		employees.forEach(x -> System.out.println(x));

	}

}
