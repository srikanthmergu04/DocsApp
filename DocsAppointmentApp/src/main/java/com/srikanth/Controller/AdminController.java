package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srikanth.Model.*;

@Controller
public class AdminController {
	
	
	
	@RequestMapping("/adminLogin")
	public String adminLogin(HttpServletRequest req)
	{
		String uname = req.getParameter("username");
		String psword = req.getParameter("password");
		
		if(uname.equals(psword)&&uname.equals("admin"))
		{
			return "adminFeatures.jsp";
		}
		else
		{
			return "errorAdminLogin.jsp";
		}
		
		
		
	}
	


	

}
