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
	public String patientLogin(HttpServletRequest req , Model model)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		String pin = req.getParameter("pin");
		
		int status = patientService.verifyPatient(pid, pin);
		
		if(status == 1)
		{
			model.addAttribute("pid", pid);
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
	
	@RequestMapping("/patientId")
	public String bookAppointment(HttpServletRequest req , Model model)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		model.addAttribute("pid", pid);
		return "bookAppointment.jsp";
	}
	
	@RequestMapping("/viewPatientProfile")
	public String viewPatientProfileBYId(HttpServletRequest req , Model model)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		Patient patient = patientService.getPatientObject(pid);
		
		model.addAttribute("patient", patient);
		
		return "PatientDetailsById.jsp";
		
	}
	
	@RequestMapping(value = "/updateOrDelete" , method = RequestMethod.POST)
	public String performUpdateOrDelete(HttpServletRequest req , Model model)
	{
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		String action = req.getParameter("action");
		
		if(action.equals("update"))
		{
			Patient patient = patientService.getPatientObject(pid);
			model.addAttribute("patient", patient);
			return "updatePatientDetails.jsp";
		}
		else
		{
			patientService.deletePatientProfile(pid);
			return "patDelSuccess.jsp";
		}
		
		
	}
	
	@RequestMapping(value = "/updatePatient" , method = RequestMethod.POST)
	public String updatePatient(HttpServletRequest req ,@ModelAttribute("patient") Patient patient , Model model)
	{
		
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		
		patient.setPid(pid);
		patientService.updatePatientProfile(patient);
		model.addAttribute("patient", patient);
		return "PatientDetailsById.jsp";
		
	}
	


}
