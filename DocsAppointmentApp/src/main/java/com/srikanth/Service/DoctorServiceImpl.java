package com.srikanth.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.DoctorDao;
import com.srikanth.Model.Doctor;
import com.srikanth.Model.Patient;

public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDao doctorDao;
	public void registerDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		doctorDao.registerDoctor(doctor);

	}
	public int verifyDoctor(Integer pid, String pin) {
		// TODO Auto-generated method stub
		
		Doctor doctor = doctorDao.getDoctorObject(pid);
		
		String password = doctor.getPin();
		
		if(pin.equals(password))
		{
		   return 1;	
		}
		else
		{
			return -1;
		}
		
		
	}
	public List<Doctor> getDoctorsBySpecialization(String specialization) {
		// TODO Auto-generated method stub
		
		List<Doctor> list = doctorDao.getDoctorsBySpecialization(specialization);
		
		return list;
	}
	public List<Doctor> getListOfDoctors() {
		// TODO Auto-generated method stub
		
		List<Doctor> list = new ArrayList();
		
		list = doctorDao.getListOfDoctors();
		
		return list;
	}
	public Set<Patient> getPatientsAppointmentsList(int did) {
		// TODO Auto-generated method stub
		
		Doctor doctor = doctorDao.getDoctorObject(did);
		
		Set<Patient> list = new HashSet<Patient>();
		
		list = doctor.getPatList();
		
		
		return list;
	}

}
