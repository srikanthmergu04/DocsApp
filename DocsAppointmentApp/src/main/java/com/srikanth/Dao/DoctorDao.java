package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Doctor;


public interface DoctorDao {
	
	public void registerDoctor(Doctor doctor);
	
	public Doctor getDoctorObject(Integer pid);
	
	public List<Doctor> getDoctorsBySpecialization(String specialization);
	
	public List<Doctor> getListOfDoctors();
	
	

}
