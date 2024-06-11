package com.crickservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

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

	public Object allIndianCricketMedStaffCount() {
		List<Crickstaff> crickstaffs = crickdao.allIndianCricketStaffCount();

		ArrayList<Crickstaff> a1Crickstaff = new ArrayList<Crickstaff>();
		for (Crickstaff crickStaff : crickstaffs) {
			if (crickStaff.getStaffDept().equals("Med")) {
				a1Crickstaff.add(crickStaff);
			}
		}
		return a1Crickstaff.size();
	}

	public HashMap<String, String> getAgeandNameofstaff() {
		HashMap<String, String> ageNameMap = new HashMap<String, String>();
		List<Crickstaff> crickStaffs = crickdao.allIndianCricketStaffCount();
		for (Crickstaff crickStaff : crickStaffs) {
			ageNameMap.put(crickStaff.getStaffName(), crickStaff.getStaffAge());

		}
		return ageNameMap;
	}

	public String getMaxyearsofexp() {

		List<Crickstaff> crickStaffs = crickdao.allIndianCricketStaffCount();
		TreeMap<String, String> maxyearsExp = new TreeMap<String, String>();

		for (Crickstaff crickStaff : crickStaffs) {
			maxyearsExp.put(crickStaff.getStaffnoOfYearstoBCCI(), crickStaff.getStaffName());
		}
		
		System.err.println(maxyearsExp);
		String nameofperson = maxyearsExp.get(13);
		return nameofperson;
	}

}
