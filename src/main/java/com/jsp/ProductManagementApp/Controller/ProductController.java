package com.jsp.ProductManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.ProductManagementApp.Entity.MyCart;
import com.jsp.ProductManagementApp.Entity.Product;
import com.jsp.ProductManagementApp.Service.MyCartService;
import com.jsp.ProductManagementApp.Service.ProductService;


@Controller
public class ProductController 
{
	@Autowired 
	MyCartService cs;
	
	@Autowired
	ProductService ps;
	
	
	
	@PostMapping("/save")
	public String addProduct(@ModelAttribute Product p)
	{
		cs.save(p);
		
		return "redirect:/available_product";
		
	}
	@GetMapping("/")
	public static String home()
	{
		return "HomePage";
		
	}
	@GetMapping("available_product")
	public ModelAndView getAllProducts()
	{
		List<Product> list=cs.getAllProducts();
		
		return new ModelAndView("productList","product",list);
		

		
	}
	
	@GetMapping("/my_product")
	public String getMyProducts(Model model)
	{
		List<Product> list=cs.getAllProducts();
		
		model.addAttribute("product", list);
		return "myProducts";
	}
	@GetMapping("/product_register")
	public String productRegister()
	{
		return "productRegister.html";
		
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id)
	{
		Product p=ps.getProductId(id);
		
		MyCart mp=new MyCart();
		p.getId();
		p.getName();
		p.getPrice();
		p.getDescription();
		cs.save(p);
		
		return "redirect:/my_product";
		
	}
	
	public String getMyproducts(Model model)
	{
		List<Product> list=cs.getAllProducts();
		
		model.addAttribute("product", list);
		return "myProducts";
	}
	
	@RequestMapping("/editProduct/{id}")
	public String editProduct(@PathVariable("id") int id, Model model)
	{
		Product p=ps.getProductId(id);
		
		model.addAttribute("product", p);
		
		return "productEdit";
		
		
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public String deleteById(@PathVariable("id") int id)
	{
		ps.deleteById(id);
		return "redirect:/available_product";
		
	}


}
