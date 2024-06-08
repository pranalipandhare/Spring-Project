package com.example.firstproject;

public class CricketStars {
	
	int cricketerID;
	String CricketerName;
	String CricketerCentury;
	int CricketerEx;
	public int getCricketerID() {
		return cricketerID;
	}
	public void setCricketerID(int cricketerID) {
		this.cricketerID = cricketerID;
	}
	public String getCricketerName() {
		return CricketerName;
	}
	public void setCricketerName(String cricketerName) {
		CricketerName = cricketerName;
	}
	public String getCricketerCentury() {
		return CricketerCentury;
	}
	public void setCricketerCentury(String cricketerCentury) {
		CricketerCentury = cricketerCentury;
	}
	public int getCricketerEx() {
		return CricketerEx;
	}
	public void setCricketerEx(int cricketerEx) {
		CricketerEx = cricketerEx;
	}
	@Override
	public String toString() {
		return "CricketStars [cricketerID=" + cricketerID + ", CricketerName=" + CricketerName + ", CricketerCentury="
				+ CricketerCentury + ", CricketerEx=" + CricketerEx + "]";
	}
	
	public CricketStars(int cricketerID, String cricketerName, String cricketerCentury, int cricketerEx) {
		super();
		this.cricketerID = cricketerID;
		CricketerName = cricketerName;
		CricketerCentury = cricketerCentury;
		CricketerEx = cricketerEx;
	}
	public CricketStars() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
