package com.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Faculty {

	int facultyID;
	String facultyName;
	int facultyExpYears;
	List<Subject> facultysubName;

	public int getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getFacultyExpYears() {
		return facultyExpYears;
	}

	public void setFacultyExpYears(int facultyExpYears) {
		this.facultyExpYears = facultyExpYears;
	}

	public List<Subject> getFacultysubName() {
		return facultysubName;
	}

	public void setFacultysubName(List<Subject> facultysubName) {
		this.facultysubName = facultysubName;
	}

	@Override
	public String toString() {
		return "Faculty [facultyID=" + facultyID + ", facultyName=" + facultyName + ", facultyExpYears="
				+ facultyExpYears + ", facultysubName=" + facultysubName + "]";
	}

	public Faculty(int facultyID, String facultyName, int facultyExpYears, List<Subject> facultysubName) {
		super();
		this.facultyID = facultyID;
		this.facultyName = facultyName;
		this.facultyExpYears = facultyExpYears;
		this.facultysubName = facultysubName;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

}
