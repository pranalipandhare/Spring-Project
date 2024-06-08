package com.airlinecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlineservice.AirlineService;

@RestController
public class AirlineController {

	@Autowired
	AirlineService airlineService;

	@GetMapping("airlineteam")
	public List<Flight> getFlightDetails() {
		return airlineService.getFlightDetails();
	}

}
