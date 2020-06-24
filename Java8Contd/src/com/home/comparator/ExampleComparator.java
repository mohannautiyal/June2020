package com.home.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleComparator {
	
	
	// Comparator using the standard definition
	static Comparator<Person> personComparator = new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			// TODO Auto-generated method stub
			return p1.getFirstName().compareTo(p2.getFirstName());
		}
		
	};
	
	// Comparator using lambda
	static Comparator<Person> lamdaPersonComparator = ( p1,  p2) -> p1.getFirstName().compareTo(p2.getFirstName());
	
	static Comparator<Person> lamdaPersonComparator1 = Comparator.comparing(p ->p.getFirstName());
	
	static Comparator<Person> lamdaPersonComparator3 = Comparator.comparingInt(p->p.getAge());

	
	static Comparator<Person> salaryComparator = Comparator.comparing(e -> e.getEmployee(), (o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));

	static Comparator<Person> salaryComparator1 = Comparator.comparingInt(p->p.getEmployee().getSalary());

   public static void main(String[] args) {
	   ArrayList<Person> persons =  new ArrayList<Person>();
       persons.add(new Person("Mohan","Nautiyal",40,73.0,new Employee(20000,"TestLead")));
       persons.add(new Person("Raj","Kumar",38,65.0,new Employee(10000,"Tester")));
       persons.add(new Person("Sheetal","Kumar",45,80.0,new Employee(50000,"Test Manager")));
       persons.add(new Person("Bina","Kumar",35,80.0,new Employee(20000,"Trainee")));

       persons.stream().forEach(p -> System.out.println(p));
     //  Collections.sort(persons, lamdaPersonComparator);
     //  Collections.sort(persons, (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
     //  Collections.sort(persons, lamdaPersonComparator1);
     //  Collections.sort(persons, lamdaPersonComparator3);
       Collections.sort(persons, salaryComparator1);
       System.out.println("======================================");
       persons.stream().forEach(p -> System.out.println(p));

}


}

class Employee{
	
	private Integer salary;
	private String designation;
	public Employee(Integer salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + "]";
	}
	
	
}

class Person{
	private String firstName;
	private Integer age;
	private String lastName;
	private Employee employee;
	private Double weight;
	public Person(String firstName,  String lastName,Integer age,Double weight, Employee employee) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.lastName = lastName;
		this.employee = employee;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + ", employee=" + employee
				+ ", weight=" + weight + "]";
	}
	
	
	
}