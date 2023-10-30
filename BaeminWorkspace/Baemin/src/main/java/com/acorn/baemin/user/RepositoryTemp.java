package com.acorn.baemin.user;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTemp implements UserRepositoryI {

	@Override
	public List<UserDTO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		List<UserDTO> list = new ArrayList<>();
		list.add(new UserDTO());
		list.add(new UserDTO());
		list.add(new UserDTO());

		return null;
	}

	@Override
	public boolean loginCustomer(String unputId, String inputPw) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String home() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String sellerHome() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String selectSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String customerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String customerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String customerModify() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String sellerSignup() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String sellerLogin() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String sellerModify() {
//		// TODO Auto-generated method stub
//		return null;
	}

}
