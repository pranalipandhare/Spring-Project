package com.example.demo;

import java.util.ArrayList;

public class StudentService {

	StudentDao dao;

	public ArrayList<facultySubject> allfacsubjects() {
		dao = new StudentDao();

		ArrayList<facultySubject> a1 = dao.allfacsubjects();
		ArrayList<facultySubject> a1filtered = new ArrayList<facultySubject>();
		for (facultySubject FacultySubject : a1) {
			if (!FacultySubject.getFacname().equals("react")) {
				a1filtered.add(FacultySubject);
			}
		}

		return a1filtered;

	}

}
