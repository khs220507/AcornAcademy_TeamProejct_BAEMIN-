package com.acorn.baemin.home.service;

import java.util.List;


import com.acorn.baemin.home.domain.CartMenuDTO;

public interface CartServiceI {
	public List<CartMenuDTO> selectCartMenuAll();
}
