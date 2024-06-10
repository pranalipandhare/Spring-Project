package com.classservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classdao.ClassroomDao;

@Service
public class ClassroomService {
	
	@Autowired	
	ClassroomDao classdao;

	public int allIndianCricketStaffCount() {
		
		return 0;
	}

}
