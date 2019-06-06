package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Doctor;
import com.srikanth.Model.Patient;

public interface PatientDao {
	
	public void registerPatient(Patient patient);
	
	public Patient getPatientObject(Integer pid);
	
	public List<Patient> getListOfPatients();
	
	public void selectDoctor(Integer pid , Integer did);

}
