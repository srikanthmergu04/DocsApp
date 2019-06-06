package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srikanth.Model.Patient;
import com.srikanth.Service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@RequestMapping("/registerPatient")
	public String registerPatient(Model model)
	{
		model.addAttribute("patient", new Patient());
		return "registerPatient.jsp";	
				
	}
	
	@RequestMapping(value = "/addPatient" , method = RequestMethod.POST)
	public String addPatient(@ModelAttribute("patient") Patient patient , Model model)
	{
		patientService.registerPatient(patient);
		
		model.addAttribute("patient", patient);
		
		return "DisplayPatientDetails.jsp";
		
	}
	
	@RequestMapping("/patientLogin")
	public String patientLogin(HttpServletRequest req)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		String pin = req.getParameter("pin");
		
		int status = patientService.verifyPatient(pid, pin);
		
		if(status == 1)
		{
			
			return "patientFeatures.jsp";
			
		}
		else
		{
			return "errorLogin.jsp";
		}
		
		
		
	}
	
	@RequestMapping("/getPatientsList")
	public String getListOfPatients(Model model)
	{
		List<Patient> list = new ArrayList();
		
		list = patientService.getListOfPatients();
		
		model.addAttribute("list", list);
		
		return "patientsDetails.jsp";
		
		
	}
	
	@RequestMapping(value = "/bookDoctor" , method = RequestMethod.POST)
	public String selectDoctor(HttpServletRequest req)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		System.out.println("pid = "+pid);
		
		Integer did = Integer.parseInt(req.getParameter("did"));
		
		System.out.println(" did =  "+did);
		
		patientService.selectDoctor(pid, did);
		
		System.out.println("patient selected Doctor for Appointment");
		
		return "appointmentSuccessfull.jsp";
		
	}
	
	


}
