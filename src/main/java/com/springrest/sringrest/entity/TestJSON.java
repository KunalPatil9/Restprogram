package com.springrest.sringrest.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestJSON {
	

	@JsonProperty("Name")
	private String Name;	
	@JsonProperty("Age")
	private int Age;
	@JsonProperty("Company_Name")
	private String Company_Name;
	@JsonProperty("Phone_No")
	private ArrayList<String> Phone_No;
	
	
	@Override
	public String toString() {
		return "TestJSON [Name=" + Name + ", Age=" + Age + ", Company_Name=" + Company_Name + ", Phone_No=" + Phone_No+ "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public ArrayList<String> getPhone_No() {
		return Phone_No;
	}

	public void setPhone_No(ArrayList<String> phone_No) {
		Phone_No = phone_No;
	}
	
	
}
