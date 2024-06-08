package com.airlinecontroller;

public class Flight {

	int flightNumber;
	String FlightName;
	String FlightDestination;
	String FlightTime;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return FlightName;
	}

	public void setFlightName(String flightName) {
		FlightName = flightName;
	}

	public String getFlightDestination() {
		return FlightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		FlightDestination = flightDestination;
	}

	public String getFlightTime() {
		return FlightTime;
	}

	public void setFlightTime(String flightTime) {
		FlightTime = flightTime;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", FlightName=" + FlightName + ", FlightDestination="
				+ FlightDestination + ", FlightTime=" + FlightTime + "]";
	}

	public Flight(int flightNumber, String flightName, String flightDestination, String flightTime) {
		super();
		this.flightNumber = flightNumber;
		FlightName = flightName;
		FlightDestination = flightDestination;
		FlightTime = flightTime;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

}
