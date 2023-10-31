package com.acorn.baemin.user.repository;

import java.util.List;

import com.acorn.baemin.domain.UserDTO;


public interface LoginRepositoryI {

	
	public String sellerHome();

	
	public String sellerSignup();

	
	public String sellerLogin();

	
	public String sellerModify();
	
	public List<UserDTO> selectAll() throws Exception;

	public boolean loginCustomer(String unputId, String inputPw) throws Exception;


	public String login();

	
	public String home();

	
	public String selectSignup();

	
	public String customerSignup();

	
	public String customerHome();

	
	public String logout();

	
	public String customerModify();

	
}
