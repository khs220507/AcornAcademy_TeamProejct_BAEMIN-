package com.acorn.baemin.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.CartDTO;
import com.acorn.baemin.home.domain.CartMenuDTO;



@Repository
public class CartRepositoryImp implements CartRepositoryI {
	@Autowired
	private SqlSession session;
	
	private static String namespace ="com.acorn.CartMapper.";

	@Override
	public List<CartMenuDTO> selectCartMenuAll() {
		return session.selectList(namespace + "selectStoreNameAll");
	}



}
