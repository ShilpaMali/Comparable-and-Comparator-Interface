package com.velocity.sorting.comparable;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {

		// create ArrayList<Employee>
		ArrayList<Employee> al = new ArrayList<Employee>();
		// how to add elements into al
		al.add(new Employee(101, "ram", 8500));
		al.add(new Employee(105, "yogesh", 7500));
		al.add(new Employee(103, "chetan", 8000));
		Collections.sort(al); // we are getting error

		// use for each loop
		for (Employee emp : al) {
			// how to get the data from emp object
			// System.out.println(emp);
			// int ids=emp.getId();
			// System.out.println(ids);
			System.out.println("ID>>" + emp.getId());
			System.out.println("Name>>" + emp.getName());
			System.out.println("Salary>>" + emp.getSalary());
		}

	}

}
