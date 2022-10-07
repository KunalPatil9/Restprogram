package com.springrest.sringrest.services;

import java.util.List;

import com.springrest.sringrest.entity.TestObject;

public interface TestService {
	
	public List<TestObject> getStudentList();

	public TestObject getStudent(long rollNo);

}
