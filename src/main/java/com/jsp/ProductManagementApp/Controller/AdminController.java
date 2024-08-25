package com.jsp.ProductManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsp.ProductManagementApp.Entity.Admin;
import com.jsp.ProductManagementApp.Service.AdminService;

@Controller
public class AdminController 
{
	
	
	@Autowired
	AdminService as;
	
	@PostMapping("/SaveAdmin")
	public String save(@ModelAttribute Admin admin)
	{
		as.save(admin);
		
		return "adminloginfrom";
	}
	

	

}
