package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crickservice.CrickService;

@RestController
public class WC20Controller {
	
	@Autowired
	CrickService Crickservice;
	
	@GetMapping("/totalcrickstaff")
	public int allIndianCricketStaffCount() {
		return 0;
	}
	
	

}
