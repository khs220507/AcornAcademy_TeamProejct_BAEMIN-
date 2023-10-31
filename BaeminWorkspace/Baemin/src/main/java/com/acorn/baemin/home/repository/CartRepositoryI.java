package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.domain.CartDTO;
import com.acorn.baemin.home.domain.CartMenuDTO;


public interface CartRepositoryI {
	public List<CartMenuDTO> selectCartMenuAll();
}
