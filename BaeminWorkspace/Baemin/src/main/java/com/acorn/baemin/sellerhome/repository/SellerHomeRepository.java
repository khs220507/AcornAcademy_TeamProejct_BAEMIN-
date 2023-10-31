package com.acorn.baemin.sellerhome.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.acorn.baemin.domain.StoreDTO;
@Repository
public class SellerHomeRepository  {
	@Autowired
	private SqlSession session;

	
	    private static String namespaceStore = "com.acorn.StoreMapper.";
	    
	     // 준태
//	    public List<StoreDTO> selectAll() throws Exception {
//	    	System.out.println("good");
//	        return session.selectList(namespace+"test1");
//	    }
	
	    public List<StoreDTO> sellerStore(String sellerCode) {
	    	return session.selectList(namespaceStore+"sellerStore",sellerCode);
	    }
	    
	    public void insertStore (StoreDTO store) {
	    	session.insert(namespaceStore+"insertStore", store);
	    }
	    



}