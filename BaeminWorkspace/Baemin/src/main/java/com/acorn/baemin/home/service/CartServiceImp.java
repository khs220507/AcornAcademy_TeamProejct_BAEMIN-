package com.acorn.baemin.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.baemin.domain.CartDTO;
<<<<<<< HEAD
import com.acorn.baemin.home.repository.CartRepositoryI;
=======
import com.acorn.baemin.home.domain.CartMenuDTO;
>>>>>>> f880ac08703c011308f9419419520cca3f432121
import com.acorn.baemin.home.repository.CartRepositoryImp;

@Component
public class CartServiceImp implements CartServiceI{
	
	
	
	@Autowired
	CartRepositoryImp dao;
	

	@Override
	public List<CartMenuDTO> selectCartMenuAll() {
		return dao.selectCartMenuAll();
	}
	
	
}
