package com.example.firstproject;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("hii")
	public String welcomemsg(){
		return "Welcome-Home";		
	}
	
	@GetMapping("allSubjectsbyFaculty")
	public ArrayList<FacultySubject> allfacsubject() {
		ArrayList<FacultySubject> a1 = new ArrayList<FacultySubject>();
		a1.add(new FacultySubject(1, "Sagar", "React", 10));
		a1.add(new FacultySubject(2, "Atul", "Core Java", 6));
		a1.add(new FacultySubject(3, "Pradip", "Angular", 7));
		a1.add(new FacultySubject(4, "Kiran", "Advanced", 12));
		a1.add(new FacultySubject(5, "Prathamesh", "SQL", 5));
		a1.add(new FacultySubject(6, "Kalyani", "HTML", 9));
		return a1;

	}
	
	@GetMapping("theCricketstarsList")
	public ArrayList<CricketStars> allcricketstar(){
		ArrayList<CricketStars> a2 = new ArrayList<CricketStars>();
		a2.add(new CricketStars(1, "Virat-Kohali", "100", 16));
		a2.add(new CricketStars(2, "Sachin Tendulkar", "100", 24));
		a2.add(new CricketStars(3, "Mahendra-Dhoni", "16", 20));
		a2.add(new CricketStars(4, "Hardik-Pandya", "1", 25));
		a2.add(new CricketStars(5, "Rohit-Sharma", "36", 25));
		a2.add(new CricketStars(6, "Kumar Sangakkara", "63", 18));
		a2.add(new CricketStars(7, "Shubhman-Gill", "1", 12));
		
		return a2;
		
		
	}
}
