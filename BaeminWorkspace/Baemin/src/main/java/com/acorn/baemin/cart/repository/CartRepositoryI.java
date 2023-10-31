package com.acorn.baemin.cart.repository;

import java.util.List;

import com.acorn.baemin.cart.domain.CartDTOTest;
import com.acorn.baemin.cart.domain.MenuDTOTest;
import com.acorn.baemin.cart.domain.StoreDTOTest;
import com.acorn.baemin.domain.CartDTO;
import com.mysql.cj.Session;



public interface CartRepositoryI {
	public List<CartDTOTest> selectCart(String id);
	public List<StoreDTOTest> selectStores(List<CartDTOTest> cartList);
	
}
