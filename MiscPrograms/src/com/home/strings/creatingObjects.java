package com.home.strings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class creatingObjects {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, CloneNotSupportedException, ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		// 1 Using new keyword
		employee emp = new employee();
		emp.empName = "Madan";

		// 2 Using new instance
		employee emp1 = employee.class.newInstance();
		// Class.forName("employee").newInstance();
		emp1.empName = "Rahul";

		// 3 using clone
		employee emp2 = emp.clone();

		// Using Constructor new instance

		Constructor<employee> c = employee.class.getConstructor();
		employee emp4 = c.newInstance();

		emp4.empName = "Raj";

		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp4.toString());

	}

}
