package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.FacultyService;

@RestController
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;

	@GetMapping("allsubjects")
	List<String> facultySubjects() {
		return facultyService.allSubjects();
	}
	
	@GetMapping("Person")
	String highestExpPerson() {
		return facultyService.highestExpPerson();
	}

}
