package com.acorn.baemin.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryI {
	@Autowired
	private SqlSession session;

	private static String namespace = "com.acorn.userMapper.";	
	
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