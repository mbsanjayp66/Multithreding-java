package com.sanjay.BuilderDesign;

public class Director {
	StudentBuilder sb;

	public Director(StudentBuilder sb) {
		this.sb = sb;
	}

	public Student createStudent() {
		if (sb instanceof EngineeringStudentBuilder) {
			return createEngStudent();
		} else if (sb instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}

	private Student createMBAStudent() {
		return sb.setRollNumber(101).setAge(11).setName("Aka").setSubjects().build();
	}

	private Student createEngStudent() {
		return sb.setName("Sanjay").build();
	}

}
