package com.acorn.baemin.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.CartDTO;


@Repository
public class CartRepositoryImp implements CartRepositoryI {
	@Autowired
	private SqlSession session;
	
	private static String namespace ="com.acorn.cartMapper.";

	@Override
	public List<CartDTO> selectAll() {
		return session.selectList(namespace + "selectAll");
	}

}
