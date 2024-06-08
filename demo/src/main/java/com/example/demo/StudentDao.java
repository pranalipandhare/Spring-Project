package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class StudentDao {
	
	public ArrayList<facultySubject> allfacsubjects(){
		ArrayList<facultySubject> a1 = new ArrayList<>();
		facultySubject  fs1 = new facultySubject(11, "Java");
		facultySubject  fs2 = new facultySubject(12, "Angular");
		facultySubject  fs3 = new facultySubject(13, "React");
		facultySubject  fs4 = new facultySubject(14, "Spring");
		a1.add(fs1);
		a1.add(fs2);
		a1.add(fs3);
		a1.add(fs4);
		return a1;
	}

}
