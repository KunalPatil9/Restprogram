package com.springrest.sringrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.springrest.sringrest.entity.TestObject;

@Service
public class TestServiceImpl implements TestService{

	List<TestObject> list;
	
	public TestServiceImpl() {
		list = new ArrayList<>();
		list.add(new TestObject(123,"Kunal") );
		list.add(new TestObject(14,"Swati"));
		list.add(new TestObject(13,"Manoj"));		
	}
	
	@Override
	public List<TestObject> getStudentList() {	
		return list;
	}

	@Override
	public TestObject getStudent(long rollNo) {
		
		TestObject  tt = null;
		for (TestObject testObject : list ) {
			
			if (testObject.getRollNo() == rollNo) {
				
				tt = testObject;
				break;
			}
		}
		
		return tt;
	}

	/*
	 * @Override public TestObject getStudentList(int rn) { // TODO Auto-generated
	 * method stub TestObject tob =null;
	 * 
	 * for(TestObject testObject : list) {
	 * 
	 * if (testObject.getRollNo() == rn) {
	 * 
	 * tob = testObject; break;
	 * 
	 * } }
	 * 
	 * return tob; }
	 */

}
