package com.sportyshoes.p3.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sportyshoes.p3.dao.ProductRepository;
import com.sportyshoes.p3.entity.Product;

@Controller
public class HomeController {
	
//	@Autowired
//    ProductRepository productRepository;

	//Requesting home-page of the site
	@GetMapping("/home")
	public String homePage() {
		System.out.println("Home page....");
		return "home";
	}
	
	@GetMapping("/product")
	public String ProductManage() {
		System.out.println("Product management page....");
		return "product";
	}
	
	@GetMapping("/alter_product")
	public String AlterProduct() {
		System.out.println("Alter product page....");
		return "alter_product";
	}
	
	@GetMapping("/alterCategory")
	public String AlterCategory() {
		System.out.println("Alter category page....");
		return "alterCategory";
	}

	@GetMapping("/pwdChange")
	public String ChangePassword() {
		System.out.println("Change password page....");
		return "pwdChange";
	}
	
	
//	 @PostMapping("/add")
//	    public String addUser(@Valid Product product, BindingResult result, Model model) {
//	        if (result.hasErrors()) {
//	            return "alterProduct";
//	        }
//	        
//			productRepository.save(product);
//	        return "redirect:/productList";
//	    }
}
