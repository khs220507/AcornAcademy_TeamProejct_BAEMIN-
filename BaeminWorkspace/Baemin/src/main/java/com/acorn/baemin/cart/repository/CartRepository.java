package com.acorn.baemin.cart.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.cart.domain.CartDTOTest;
import com.acorn.baemin.cart.domain.MenuDTOTest;
import com.acorn.baemin.cart.domain.StoreDTOTest;


@Repository
public class CartRepository implements CartRepositoryI {
	@Autowired
	private SqlSession session;
	
	private static String namespace ="com.acorn.CartMapper.";

	@Override
	public List<CartDTOTest> selectCart(String id) {
		return session.selectList(namespace + "selectCart", id);
	}

	@Override
	public List<StoreDTOTest> selectStores(List<CartDTOTest> cartList) {
		return session.selectList(namespace+"selectStores", cartList);
	}

	
	}




