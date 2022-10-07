package com.springrest.sringrest.entity;

public class TestObject {
	
	private long rollNo;
	private String name;
	
	
	public TestObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TestObject(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestObject [rollNo=" + rollNo + ", name=" + name + "]";
	}



	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
