package com.sanjay.BuilderDesign;

import java.util.List;

public abstract class StudentBuilder {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String>subject;
	
	public StudentBuilder setRollNumber(int number) {
		this.rollNumber = number;
		return this;
	}
	public StudentBuilder setAge(int number) {
		this.age = number;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setFatherName(String name) {
		this.fatherName = name;
		return this;
	}
	public StudentBuilder setMotherName(String name) {
		this.motherName = name;
		return this;
	}
	abstract public StudentBuilder setSubjects();
	
	public Student build() {
		return new Student(this);
	}
}
