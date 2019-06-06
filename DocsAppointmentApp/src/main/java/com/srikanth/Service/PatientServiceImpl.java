package com.srikanth.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.PatientDao;
import com.srikanth.Model.Doctor;
import com.srikanth.Model.Patient;

public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDao patientDao;

	public void registerPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		patientDao.registerPatient(patient);

	}

	public int verifyPatient(Integer pid, String pin) {
		// TODO Auto-generated method stub
		
		Patient patient = patientDao.getPatientObject(pid);
		
		String password = patient.getPin();
		
		if(pin.equals(password))
		{
		   return 1;	
		}
		else
		{
			return -1;
		}
		
		
	}

	public List<Patient> getListOfPatients() {
		// TODO Auto-generated method stub
		
		List<Patient> list = new ArrayList();
		
		list = patientDao.getListOfPatients();
		
		return list;
	}

	public void selectDoctor(Integer pid, Integer did) {
		// TODO Auto-generated method stub
		
		patientDao.selectDoctor(pid, did);
		
	}

}
