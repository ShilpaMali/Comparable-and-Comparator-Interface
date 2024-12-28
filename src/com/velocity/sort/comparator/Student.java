package com.velocity.sort.comparator;

public class Student {
	int studId;
	String studName;
	int studSalary;
	public Student(int studId, String studName, int studSalary) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studSalary = studSalary;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudSalary() {
		return studSalary;
	}
	public void setStudSalary(int studSalary) {
		this.studSalary = studSalary;
	}
	
	

}
