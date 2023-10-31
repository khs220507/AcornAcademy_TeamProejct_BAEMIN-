package com.acorn.baemin.seller.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
@Controller
public class SellerController {
	@Autowired
	SellerRepository rep;
	
	// 태민
	
	
	
	// 준태

	@GetMapping("/Sellerone")
	public String selectAll( Model model) {

		StoreDTO result  = rep.select("30001");
		model.addAttribute("item", result);
		System.out.println( result);
		return "seller/test2";
		}
	

	@GetMapping("/sellerall")
	public String  main(Model model ) {		
		List<StoreDTO> result;

		try {
			result = rep.selectAll();
			
			model.addAttribute("list", result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "seller/test1";
	}
	
	@GetMapping("/sellerHome")
	public String sellerHome(){
		return "seller/seller_home";

	}
}
