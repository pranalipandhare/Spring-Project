package com.entity;

public class Subject {

	int subID;
	String subName;

	public int getSubID() {
		return subID;
	}

	public void setSubID(int subID) {
		this.subID = subID;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject [subID=" + subID + ", subName=" + subName + "]";
	}

	public Subject(int subID, String subName) {
		super();
		this.subID = subID;
		this.subName = subName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
