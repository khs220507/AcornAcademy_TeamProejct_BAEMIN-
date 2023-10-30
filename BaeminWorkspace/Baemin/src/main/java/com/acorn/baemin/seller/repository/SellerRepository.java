package com.acorn.baemin.seller.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.seller.domain.StoreDTO;



@Repository
public class SellerRepository {
	    @Autowired
	    private SqlSession session;
	 	
	    private static String namespace = "com.acorn.StoreMapper.";
	    
	    public List<StoreDTO> selectAll() throws Exception {
	    	System.out.println("good");
	        return session.selectList(namespace+"test1");
	    }
	    
	    public StoreDTO select(String storeCode) {
	    	return session.selectOne(namespace+"test2",storeCode);
	    }
	    
	   
	   
	    
}