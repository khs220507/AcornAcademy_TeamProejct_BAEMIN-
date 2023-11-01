package com.acorn.baemin.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.OrderDTO;

@Repository
public class OrderRepository implements InterOrderRepository{

	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.acorn.HomeMapper.";
	
	// 주문내역 조회
	@Override
	public List<OrderDTO> orderSelectAll(int userCode) {
    	System.out.println("orderList show");
        return session.selectList(namespace+"orderSelectAll",userCode);
    }
	
	// 주문내역 삭제
	@Override
	public int orderDelete(int orderNumber) {

		return session.delete(namespace+"orderDelete", orderNumber);
	}

	///////////////////////////////////////////////////////////////////////////////////
	
	// 상세주문내역 조회
	
	
	
	
}
