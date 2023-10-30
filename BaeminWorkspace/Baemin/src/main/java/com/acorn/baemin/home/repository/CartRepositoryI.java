package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.home.domain.CartDTO;

public interface CartRepositoryI {
	public List<CartDTO> selectAll();
}
