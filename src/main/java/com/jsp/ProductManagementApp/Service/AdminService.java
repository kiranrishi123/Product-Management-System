package com.jsp.ProductManagementApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.ProductManagementApp.DAO.AdminDao;
import com.jsp.ProductManagementApp.Entity.Admin;
import com.jsp.ProductManagementApp.Repository.AdminRepository;

@Service
public class AdminService 
{
	@Autowired
	AdminRepository ar;
	
	@Autowired
	AdminDao ad;
	
	public void save(Admin admin)
	{
		ad.saveAdmin(admin);
	}

}
