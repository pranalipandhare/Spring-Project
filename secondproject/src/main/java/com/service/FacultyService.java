package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FacultyDao;
import com.entity.Faculty;
import com.entity.Subject;

@Service
public class FacultyService {
	@Autowired
	FacultyDao facultyDao;

	public ArrayList<String> allSubjects() {
		ArrayList<String> a1sub = new ArrayList<String>();
		ArrayList<Faculty> facSubjects = facultyDao.facultySubjects();
		for (Faculty faculty : facSubjects) {
			List<Subject> subList = faculty.getFacultysubName();
			for (Subject subject : subList) {
				// System.out.println(subject.getSubName());
				a1sub.add(subject.getSubName());
			}
		}
		return a1sub;
	}
	public String highestExpPerson() {
		ArrayList<Faculty> facArrayList = facultyDao.facultySubjects();
		int max = 0;
		String maxExpFacultyName = "";

		for (Faculty faculty : facArrayList) {
			if (faculty.getFacultyExpYears() > max) {
				max = faculty.getFacultyExpYears();
				maxExpFacultyName = faculty.getFacultyName(); // Assuming there is a getName() method
			}
		}
		return maxExpFacultyName;
	}
}
