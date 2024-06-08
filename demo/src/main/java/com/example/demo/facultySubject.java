package com.example.demo;

public class facultySubject {
	
	int fId;
	String facname;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getFacname() {
		return facname;
	}
	public void setFacname(String facname) {
		this.facname = facname;
	}
	@Override
	public String toString() {
		return "facultySubject [fId=" + fId + ", facname=" + facname + "]";
	}
	public facultySubject(int fId, String facname) {
		super();
		this.fId = fId;
		this.facname = facname;
	}
	public facultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
