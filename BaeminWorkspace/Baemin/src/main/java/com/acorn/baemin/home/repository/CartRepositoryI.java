package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.domain.CartDTO;

public interface CartRepositoryI {
	public List<CartDTO> selectAll();
}
