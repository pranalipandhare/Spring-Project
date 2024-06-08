package com.airlineservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlinecontroller.Flight;
import com.airlinedao.AirlineDao;

@Service
public class AirlineService {

	@Autowired
	AirlineDao airlineDao;

	public List<Flight> getFlightDetails() {
		return airlineDao.Flightdetails();
	}

}
