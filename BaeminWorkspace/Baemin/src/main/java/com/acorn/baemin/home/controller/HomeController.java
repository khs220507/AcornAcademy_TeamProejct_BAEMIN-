package com.acorn.baemin.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 誘쇱�
import com.acorn.baemin.home.domain.OrderDTO;
import com.acorn.baemin.home.domain.ZzimDTO;
import com.acorn.baemin.home.repository.OrderRepository;
import com.acorn.baemin.home.repository.ZzimRepository;
// �쁽�닔
import com.acorn.baemin.home.domain.CartDTO;
import com.acorn.baemin.home.service.CartServiceI;
import com.acorn.baemin.home.service.CartServiceImp;





@Controller
public class HomeController {
	
	@Autowired
	ZzimRepository zzimDAO;
	
	@Autowired
	OrderRepository orderDAO;

	@Autowired
	CartServiceImp Imp;	
	

	@GetMapping("/home")
	public String home() {
		return "home/home";
	}
  
 
	@GetMapping("/zzim")
	public String zzimList(Model model) {
		List<ZzimDTO> result;
		try {
			result = zzimDAO.zzimSelectAll(10001);
			model.addAttribute("zzimList", result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home/zzim_list";
	}
	
	

	@GetMapping("/orderList")
	public String orderList(Model model) {
		List<OrderDTO> result;
		
		try {
			result = orderDAO.orderSelectAll(10002);
			model.addAttribute("orderList", result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home/order_list";
	}

	
	
	
	@GetMapping("/cartList")
	public String cartList(Model model) {
		List<CartDTO> result = Imp.getCartListAll();
		model.addAttribute("list", result);
		return "home/cart_list";

	}
	
}
