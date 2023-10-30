package com.acorn.baemin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
	
		@Autowired
		UserRepositoryI rep;
	
		@GetMapping("/login")
		public String login() {
			return "user/login";
		}
		@GetMapping("/customer_signup")
		public String customer_signup() {
			return "user/customer_signup";
		}
		@GetMapping("/seller_signup")
		public String seller_signup() {
			return "user/seller_signup";
		}
		@GetMapping("/select_signup")
		public String select_signup() {
			return "user/select_signup";
		}
		@GetMapping("/customer_modify")
		public String customer_modify() {
			return "user/customer_modify";
		}
		
		@RequestMapping("/selectAll" )
		public String main(Model model ) {		
			List<UserDTO> result;
			try {
				result = rep.selectAll();
				model.addAttribute("list", result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "user/login";
		
		
}
}
