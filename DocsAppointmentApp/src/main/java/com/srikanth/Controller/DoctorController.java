package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srikanth.Model.Doctor;
import com.srikanth.Model.Patient;
import com.srikanth.Service.DoctorService;


@Controller
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping("/registerDoctor")
	public String registerDoctor(Model model)
	{
		model.addAttribute("doctor", new Doctor());
		return "registerDoctor.jsp";	
				
	}
	
	@RequestMapping(value = "/addDoctor" , method = RequestMethod.POST)
	public String addDoctor(@ModelAttribute("doctor") Doctor doctor , Model model)
	{
		doctorService.registerDoctor(doctor);
		
		model.addAttribute("doctor", doctor);
		
		return "DisplayDoctorDetails.jsp";
		
	}
	
	@RequestMapping("/doctorLogin")
	public String doctorLogin(HttpServletRequest req , Model model)
	{
		Integer did = Integer.parseInt(req.getParameter("did"));
		
		String pin = req.getParameter("pin");
		
		int status = doctorService.verifyDoctor(did, pin);
		
		if(status == 1)
		{
			model.addAttribute("did", did);
			
			return "doctorFeatures.jsp";
			
		}
		else
		{
			return "errorDoctorLogin.jsp";
		}
		
		
		
	}
	
	@RequestMapping("/bookAppointment")
	public String getDoctorsListBySpecialization(HttpServletRequest req , Model model)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		System.out.println("pid = "+pid);
		
		String specialization = req.getParameter("specialization");
		
		System.out.println(" Specialization =  "+specialization);
		
		List<Doctor> list = new ArrayList();		
		
		list = doctorService.getDoctorsBySpecialization(specialization);
		model.addAttribute("pid", pid);
		
		model.addAttribute("list", list);
		
		/*
		 * System.out.println("list  = "+list);
		 * 
		 * for (Doctor doctor : list) { System.out.println("name = "+doctor.getName());
		 * System.out.println("city = "+doctor.getCity()); }
		 */
		
		return "DoctosListBySpecialization.jsp";
		
	}
	
	@RequestMapping("/getDoctorsList")
	public String getListOfDoctors(Model model)
	{
		
		List<Doctor> list = new ArrayList();
		
		list = doctorService.getListOfDoctors();
		
		model.addAttribute("list", list);
		
		return "doctorsDetails.jsp";
		
	}
	
	@RequestMapping("/patientAppointments")
	public String getListOfPatientAppointments(HttpServletRequest req , Model model)
	{
		int did = Integer.parseInt(req.getParameter("did"));
		
		System.out.println("did = "+did);
		
		Set<Patient> list = new HashSet<Patient>();
		
		list = doctorService.getPatientsAppointmentsList(did);
		
		model.addAttribute("list", list);
		
		/*
		 * for (Patient patient : list) {
		 * System.out.println("name = "+patient.getPname());
		 * System.out.println("city = "+patient.getCity()); }
		 */
		
		return "patAppointmentDetails.jsp";
		
	}

}
