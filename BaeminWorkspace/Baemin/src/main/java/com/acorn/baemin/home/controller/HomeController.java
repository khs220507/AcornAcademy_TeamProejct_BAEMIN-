package com.acorn.baemin.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acorn.baemin.home.domain.CartDTO;
import com.acorn.baemin.home.service.CartServiceI;
import com.acorn.baemin.home.service.CartServiceImp;

@Controller
public class HomeController {
	
	
	@Autowired
	CartServiceImp Imp;	
	
	@GetMapping("/home")
	public String home() {
		return "home/home";
	}
	
	
	
	
	@GetMapping("/cartList")
	public String cartList(Model model) {
		List<CartDTO> result = Imp.getCartListAll();
		model.addAttribute("list", result);
		return "home/cart_list";
	}
	
}
