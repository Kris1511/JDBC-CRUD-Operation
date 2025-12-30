package com.First.Entity;

public class Student {
	
	String name;
	int age;
	double cgpa;
	String branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, double cgpa, String branch) {
		super();
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cgpa=" + cgpa + ", branch=" + branch + "]";
	}
}
