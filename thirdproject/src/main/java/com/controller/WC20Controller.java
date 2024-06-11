package com.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crickservice.CrickService;

@RestController
public class WC20Controller {

	@Autowired
	CrickService Crickservice;

	@GetMapping("/totalstaff")
	public int allIndianCricketStaffCount() {
		return Crickservice.allIndianCricketStaffCount();
	}
	
	@GetMapping("/ageandname")
	public HashMap<String, String> fetchgetAgeandNameofstaff() {
		return Crickservice.getAgeandNameofstaff();
	}
	
	@GetMapping("/maxyearsofexperience")
	public String fetchmaxyearsofexperience() {
		return Crickservice.getMaxyearsofexp();
	}
	

}
