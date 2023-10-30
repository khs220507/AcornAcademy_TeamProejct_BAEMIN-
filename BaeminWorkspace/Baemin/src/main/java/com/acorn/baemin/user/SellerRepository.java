package com.acorn.baemin.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SellerRepository implements SellerRepositoryI{

	@Autowired
	private SqlSession session;

	private static String namespace = "com.acorn.userMapper.";

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
	
}
