package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	StudentService studentService;

	@GetMapping("firstapi")
	// first API-first method
	// we can call spring by browser or postman
	public String welcomeMessage() {
		return "message-data";

	}

	@GetMapping("allcarCompanies")
	public ArrayList<String> allcars() {
		ArrayList<String> allcar = new ArrayList<String>();
		allcar.add("Tata");
		allcar.add("Maroti");
		return allcar;
	}

	@GetMapping("allfacultysubjects")
	public ArrayList<facultySubject> allfacsubjects() {
		studentService = new StudentService();
		ArrayList<facultySubject> facultySubjects = studentService.allfacsubjects();
		return facultySubjects;
	}

}
