package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.salary;


//import jdk.internal.org.jline.utils.Log;
//@SuppressWarnings("restriction")
@RestController
//@Slf4j
public class MainController {
	
	@Autowired
	private StudentDao stud;
	
	@GetMapping(value="/getstudents",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<salary> AllStudentDetails()
	{
		return stud.findAllStudentAddress();
	}
	@PostMapping(value="/insertdetails",produces=  {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public salary InsertRecords(@RequestBody salary stud1)
	{
		//Log.info("enter the details ");
		return stud.save(stud1);
	}
}
