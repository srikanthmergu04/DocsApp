package com.srikanth.Service;

import java.util.List;
import java.util.Set;

import com.srikanth.Model.Doctor;
import com.srikanth.Model.Patient;


public interface DoctorService {
	
	public void registerDoctor(Doctor doctor);
	
	public int verifyDoctor(Integer pid , String pin);
	
	public List<Doctor> getDoctorsBySpecialization(String specialization);
	
	public List<Doctor> getListOfDoctors();
	
	public Set<Patient> getPatientsAppointmentsList(int did);
	
	

}
