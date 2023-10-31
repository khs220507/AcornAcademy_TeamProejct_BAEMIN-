package com.acorn.baemin.seller.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> f880ac08703c011308f9419419520cca3f432121
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
@Controller
public class SellerController {
	@Autowired
	SellerRepository rep;
	
	// 태민
	
	
	
	// 준태

	@GetMapping("/sellerHome")
	public String selectAll( Model model) {

		List<StoreDTO> result  = rep.sellerStore("20001");
		model.addAttribute("list", result);
		System.out.println( result);
		return "seller/seller_home";
		}
	
	@ResponseBody
	@RequestMapping( value="/sellerHome" , method=RequestMethod.POST)
	public void register(@RequestBody StoreDTO Store) {
		rep.insertStore(Store);
	}
	
<<<<<<< HEAD
	@ResponseBody
	@RequestMapping( value="/sellerHome/{storeName}" , method=RequestMethod.DELETE)
	public void delete(@PathVariable String storecode) {
		rep.delete(storecode);
	}
=======
>>>>>>> f880ac08703c011308f9419419520cca3f432121

//	@GetMapping("/sellerall")
//	public String  main(Model model ) {		
//		List<StoreDTO> result;
//
//		try {
//			result = rep.selectAll();
//			
//			model.addAttribute("list", result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return "seller/test1";
//	}
	

}
