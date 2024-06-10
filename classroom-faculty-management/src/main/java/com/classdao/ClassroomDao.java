package com.classdao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Classroom;


@Repository
public class ClassroomDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Classroom> classroomcount() {
	
		System.out.println("Factory >> " + factory);
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Classroom.class);
		return null;
		
	}

	
	

}
