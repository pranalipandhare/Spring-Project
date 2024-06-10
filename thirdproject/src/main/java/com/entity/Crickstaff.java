package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crickstaff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffID;
	String staffName;
	String staffDept;
	String staffAge;
	String staffnoOfYearstoBCCI;

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffDept() {
		return staffDept;
	}

	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}

	public String getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(String staffAge) {
		this.staffAge = staffAge;
	}

	public String getStaffnoOfYearstoBCCI() {
		return staffnoOfYearstoBCCI;
	}

	public void setStaffnoOfYearstoBCCI(String staffnoOfYearstoBCCI) {
		this.staffnoOfYearstoBCCI = staffnoOfYearstoBCCI;
	}

	@Override
	public String toString() {
		return "Crickstaff [staffID=" + staffID + ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffAge=" + staffAge + ", staffnoOfYearstoBCCI=" + staffnoOfYearstoBCCI + "]";
	}

	public Crickstaff(int staffID, String staffName, String staffDept, String staffAge, String staffnoOfYearstoBCCI) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffnoOfYearstoBCCI = staffnoOfYearstoBCCI;
	}

	public Crickstaff(String staffName, String staffDept, String staffAge, String staffnoOfYearstoBCCI) {
		super();
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffnoOfYearstoBCCI = staffnoOfYearstoBCCI;
	}

	public Crickstaff() {
		super();
		// TODO Auto-generated constructor stub
	}

}
