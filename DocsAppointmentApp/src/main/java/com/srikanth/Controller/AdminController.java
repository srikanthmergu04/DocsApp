package com.srikanth.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srikanth.*;
import com.srikanth.Model.Patient;
import com.srikanth.Service.PatientService;

@Controller
public class AdminController {

	@Autowired
	PatientService patientService;

	@RequestMapping("/adminLogin")
	public String adminLogin(HttpServletRequest req) {
		String uname = req.getParameter("username");
		String psword = req.getParameter("password");

		if (uname.equals(psword) && uname.equals("admin")) {
			return "adminFeatures.jsp";
		} else {
			return "errorAdminLogin.jsp";
		}

	}

	@RequestMapping("/copyPatientDetailsToFile")
	public void copyPatDetailsToFile() {

		List<Patient> list = new ArrayList();

		list = patientService.getListOfPatients();

		try {
			
			// String file =
			/*
			 * FileWriter file = new FileWriter("E:\\patientInfo.csv");
			 * 
			 * 
			 * file.write("Patient Details are");
			 * 
			 * file.close();
			 * 
			 * 
			 * 
			 * for (Patient patient : list) {
			 * 
			 * String name = patient.getPname();
			 * 
			 * System.out.println(" in copyPatDetailsToFile Method :: name = "+name);
			 * 
			 * file.write(name); file.write(" , "); file.write(patient.getCity());
			 * file.write(" , "); file.write(patient.getEmail()); file.write(" , ");
			 * 
			 * 
			 * file.write("\n");
			 * 
			 * 
			 * 
			 * 
			 * 
			 * System.out.println("writing to the file successfull");
			 * 
			 * //file.close();
			 * 
			 * }
			 * 
			 * file.close();
			 */
			BufferedReader br = new BufferedReader(new FileReader("E:\\patientInfo.csv"));

			String comma = " , ";

			String newLine = "\n";

			String line = "";

			

			while ((line = br.readLine()) != null) {

				String[] names = line.split(comma);
				
				System.out.println(names[0]+" :: "+names[1]+" :: "+names[2]);

			}

		

		}

		catch (Exception ex) {
			System.out.println("in catch block");
			ex.printStackTrace();
		}

	}

}
