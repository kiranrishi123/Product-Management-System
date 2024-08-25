package com.jsp.ProductManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.ProductManagementApp.Service.MyCartService;

@Controller
public class MyCartController 
{
	@Autowired
	MyCartService mcs;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyProduct(@PathVariable("id") int id)
	{
		mcs.deleteById(id);
		return "redirect:/my_product";
	}
	

}
