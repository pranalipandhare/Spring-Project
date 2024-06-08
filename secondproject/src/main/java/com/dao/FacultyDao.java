package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.entity.Faculty;
import com.entity.Subject;

@Repository
public class FacultyDao {

	public ArrayList<Faculty> facultySubjects() {
		ArrayList<Faculty> a1Facultywithsub = new ArrayList<Faculty>();

		ArrayList<Subject> a1sub = new ArrayList<Subject>();
		a1sub.add(new Subject(1, "Hindi"));
		a1sub.add(new Subject(2, "Marathi"));
		a1sub.add(new Subject(3, "English"));
		Faculty faculty1 = new Faculty(1, "RAM", 5, a1sub);

		ArrayList<Subject> a2sub = new ArrayList<Subject>();
		a2sub.add(new Subject(1, "Maths"));
		a2sub.add(new Subject(2, "Histroy"));
		a2sub.add(new Subject(3, "Geography"));
		Faculty faculty2 = new Faculty(2, "Akshay", 10, a2sub);

		a1Facultywithsub.add(faculty1);
		a1Facultywithsub.add(faculty2);

		return a1Facultywithsub;
	}

}
