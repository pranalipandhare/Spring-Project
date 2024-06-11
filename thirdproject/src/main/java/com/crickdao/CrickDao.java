package com.crickdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Crickstaff;

@Repository
public class CrickDao {

	@Autowired
	SessionFactory factory;

	public List<Crickstaff> allIndianCricketStaffCount() {

		System.err.println("Factory >> " + factory);
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Crickstaff.class);
		List<Crickstaff> crickstafflist = criteria.list();
		System.out.println(crickstafflist);
		return crickstafflist;
	}

}
