package com.sanjay.BuilderDesign;

public class Client {

	public static void main(String[] args) {
		Director director = new Director(new EngineeringStudentBuilder());
		Student s1 = director.createStudent();
		System.out.println(s1);
	}

}
