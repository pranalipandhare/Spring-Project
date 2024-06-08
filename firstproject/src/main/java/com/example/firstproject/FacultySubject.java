package com.example.firstproject;

public class FacultySubject {

	int facID;
	String facname;
	String facsubject;
	int ExInYear;

	public FacultySubject(int facID, String facname, String facsubject, int exInYear) {
		super();
		this.facID = facID;
		this.facname = facname;
		this.facsubject = facsubject;
		ExInYear = exInYear;
	}

	public int getFacID() {
		return facID;
	}

	public void setFacID(int facID) {
		this.facID = facID;
	}

	public int getExInYear() {
		return ExInYear;
	}

	public void setExInYear(int exInYear) {
		ExInYear = exInYear;
	}

	public String getFacname() {
		return facname;
	}

	public void setFacname(String facname) {
		this.facname = facname;
	}

	public String getFacsubject() {
		return facsubject;
	}

	public void setFacsubject(String facsubject) {
		this.facsubject = facsubject;
	}

	@Override
	public String toString() {
		return "FacultySubject [facID=" + facID + ", facname=" + facname + ", facsubject=" + facsubject + ", ExInYear="
				+ ExInYear + "]";
	}

	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultySubject(String facname, String facsubject, int exInYear) {
		super();
		this.facname = facname;
		this.facsubject = facsubject;
		ExInYear = exInYear;
	}

}
