package com.home.flatMap;

import java.util.ArrayList;
import java.util.List;

// Flat Map example continued
public class employeeFlatMap {

	public static void main(String[] args) {

		employee emp1 = new employee();
		emp1.setEmpName("Mohan");
		emp1.addDevice("Desktop");
		emp1.addDevice("Tablet");
		emp1.addDevice("Laptop");
		
		employee emp2 = new employee();
		emp2.setEmpName("Rohan");
		emp2.addDevice("Television");
		emp2.addDevice("Phone");
		emp2.addDevice("Laptop");
		
		
		List<employee> emplist = new ArrayList<employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		
		
		System.out.println("List of devices owned : ");
		emplist.stream().forEach(x ->System.out.println(x.getEmpName() +" " +x.getDevices().toString()));
		
		System.out.println("\nDistinct devices are as below:");
		emplist.stream().map(x ->x.getDevices())
		              .flatMap(x->x.stream())
		              .distinct()
		              .forEach(x->System.out.println(x));
		
	}

}
