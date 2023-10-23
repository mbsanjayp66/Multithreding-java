package com.sanjay.BuilderDesign;

import java.util.List;

public class Student {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String>subjects;
	
	public Student(StudentBuilder sb) {
		this.rollNumber = sb.rollNumber;
		this.age = sb.age;
		this.name = sb.name;
		this.fatherName = sb.fatherName;
		this.motherName = sb.motherName;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", subjects=" + subjects + "]";
	}
	
}
