package com.springrest.sringrest.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.sringrest.entity.TestJSON;
import com.springrest.sringrest.entity.TestObject;
import com.springrest.sringrest.services.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	

	@RequestMapping(value = "/hello", method = { RequestMethod.GET})
	public String read() {
		return "Hello";
	}
	
	@RequestMapping(value = "/getJSON", method = { RequestMethod.POST}, produces = "application/json")
	@DeleteMapping
	public String readJSON(@RequestBody TestJSON testJSON) {
		System.out.println(testJSON);
		//System.out.println(testJSON.getAge());
		return "Hello readJSON";
	}
	
	@GetMapping("/studList")
	public List<TestObject> getStudentList() {		
	return this.testService.getStudentList();		
	}
	
	@GetMapping("/studListInJSON")
	public String getStudentListINJSON(Model model) {		
		model.addAttribute("StuendtList",this.testService.getStudentList());
	return  "jsonTemplate";
	}
	
	@GetMapping("/studList/{rollNo}")
	public TestObject getStudentList(@PathVariable String rollNo) {		
	return this.testService.getStudent(Long.parseLong(rollNo));		
	}
	
	
	
}
