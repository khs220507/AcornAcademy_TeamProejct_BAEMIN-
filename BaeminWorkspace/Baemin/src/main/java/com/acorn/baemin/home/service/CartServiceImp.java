package com.acorn.baemin.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.baemin.domain.CartDTO;
import com.acorn.baemin.home.repository.CartRepositoryI;
import com.acorn.baemin.home.repository.CartRepositoryImp;

@Component
public class CartServiceImp implements CartServiceI{
	
	
	
	@Autowired
	CartRepositoryImp dao;
	

	@Override
	public List<CartDTO> getCartListAll() {
		return dao.selectAll();
	}
	
	
}
