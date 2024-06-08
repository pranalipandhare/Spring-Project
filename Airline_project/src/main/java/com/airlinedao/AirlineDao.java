package com.airlinedao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airlinecontroller.Flight;
import com.airlineservice.AirlineService;

@Repository
public class AirlineDao {

	public ArrayList<Flight> Flightdetails() {
		ArrayList<Flight> Flights = new ArrayList<Flight>();
		Flights.add(new Flight(1220, "AirIndia", "Bengluru", "09:00 AM"));
		Flights.add(new Flight(2870, "IndiGo", "Mumbai", "11:00 Am"));
		Flights.add(new Flight(5220, "SpiceJet", "New-Delhi", "2:00 Pm"));
		Flights.add(new Flight(2720, "Go-First", "Pune", "6:00 Pm"));
		Flights.add(new Flight(5520, "Alliance-Air", "Hydrabaad", "10:00 Pm"));

		return Flights;

	}

}
