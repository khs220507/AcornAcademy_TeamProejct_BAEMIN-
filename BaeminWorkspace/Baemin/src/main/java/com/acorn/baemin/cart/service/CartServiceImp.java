package com.acorn.baemin.cart.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.baemin.cart.domain.CartDTOTest;
import com.acorn.baemin.cart.domain.StoreDTOTest;
import com.acorn.baemin.cart.repository.CartRepository;
import com.acorn.baemin.domain.CartDTO;


@Component
public class CartServiceImp implements CartServiceI {

	@Autowired
	CartRepository cartRepository;

	@Override
	public Map<String, List> cartList(String id) {
		Map<String , List> cartMap= new HashMap<String , List> ();
		List<CartDTOTest> cartList = cartRepository.selectCart(id);
		List<StoreDTOTest> storeList = cartRepository.selectStores(cartList);
		cartMap.put("cartList", cartList);
		cartMap.put("storeList" , storeList);
		
		return cartMap;
	}

}
