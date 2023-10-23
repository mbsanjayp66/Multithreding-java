package com.sanjay.BuilderDesign;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String>subjList = new ArrayList<>();
		subjList.add("Math");
		subjList.add("physics");
		subjList.add("Chemistry");
		return this;
	}

}
