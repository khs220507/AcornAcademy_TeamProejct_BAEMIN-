package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.home.domain.OrderDTO;
import com.acorn.baemin.home.domain.ZzimDTO;

public interface InterOrderRepository {

	public List<OrderDTO> orderSelectAll(int userCode) throws Exception;
	
	
}
