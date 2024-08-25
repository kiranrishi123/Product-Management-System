package com.jsp.ProductManagementApp.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.jsp.ProductManagementApp.Entity.Admin;
import com.jsp.ProductManagementApp.Repository.AdminRepository;

@Repository
public class AdminDao 
{
	@Autowired AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}
	
	

}
