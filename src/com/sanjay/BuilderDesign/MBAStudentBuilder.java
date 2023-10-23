package com.sanjay.BuilderDesign;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String>subjList = new ArrayList<>();
		subjList.add("Prodcut");
		subjList.add("Management");
		subjList.add("Course");
		return this;
	}

}
