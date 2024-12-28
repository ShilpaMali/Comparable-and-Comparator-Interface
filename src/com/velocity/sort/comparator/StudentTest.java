package com.velocity.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main(String[] args) {

		// create ArrayList<Student>
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "rahul", 7000));
		al.add(new Student(108, "amit", 9000));
		al.add(new Student(105, "yogesh", 8000));
		Collections.sort(al, new SalaryComparator());
		for (Student s : al) {
			System.out.println("Id>>" + s.getStudId());
			System.out.println("Name>>" + s.getStudName());
			System.out.println("Salary>>" + s.getStudSalary());
		}
	}

}
