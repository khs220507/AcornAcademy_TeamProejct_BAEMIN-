package com.acorn.baemin.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.UserDTO;


@Repository
public class LoginRepository implements LoginRepositoryI{

	@Autowired
	private SqlSession session;

	private static String namespace = "com.acorn.LoginMapper.";

	@Override
	public String sellerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sellerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sellerLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sellerModify() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	@Override
	public List<UserDTO> selectAll() throws Exception {
		System.out.println("good");
		return session.selectList(namespace + "selectAll");
	} // List<E> selectList(String statement)

	@Override
	public boolean loginCustomer(String unputId, String inputPw) {
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
	
}
