package com.srikanth.Service;

import java.util.List;

import com.srikanth.Model.*;

public interface PatientService {
	
	public void registerPatient(Patient patient);
	
	public int verifyPatient(Integer pid , String pin);
	
	public List<Patient> getListOfPatients();
	
	public void selectDoctor(Integer pid , Integer did);
	
	public Patient getPatientObject(Integer pid);
	
	public void deletePatientProfile(Integer pid);
	
	public int updatePatientProfile(Patient patient);
	

}
