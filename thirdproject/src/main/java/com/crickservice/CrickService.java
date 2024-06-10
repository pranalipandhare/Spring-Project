package com.crickservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crickdao.CrickDao;
import com.entity.Crickstaff;

@Service
public class CrickService {

	@Autowired
	CrickDao crickdao;

	public int allIndianCricketStaffCount() {
		List<Crickstaff> crickstaffs = crickdao.allIndianCricketStaffCount();
		return crickstaffs.size();
	}
	
	public int allIndianCricketMedStaffCount() {
		List<Crickstaff> crickstaff = crickdao.allIndianCricketStaffCount();
		return crickstaff.size();
	}

}
