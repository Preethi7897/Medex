package org.medex.service;

import org.medex.beans.Doctor;
import org.medex.dao.DoctorDao;
import org.medex.dao.DoctorDaoImpl;

public class DoctorServiceImpl implements DoctorService {

	DoctorDao d_dao =new DoctorDaoImpl();
	@Override
	public boolean registerDoctor(Doctor d) {
		boolean b=d_dao.insertRegistration(d);
		
		return b;
	}

}
