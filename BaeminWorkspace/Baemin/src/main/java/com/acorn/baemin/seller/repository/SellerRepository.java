package com.acorn.baemin.seller.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.ReviewDTO;
import com.acorn.baemin.domain.StoreDTO;




@Repository

public class SellerRepository implements SellerRepositoryI{
	    @Autowired
	    private SqlSession session;
	    
	    private static String namespace = "com.acorn.SellerMapper.";
	    private static String namespaceStore = "com.acorn.StoreMapper.";
	    private static String namespaceReview = "com.acorn.ReviewMapper.";
	    private static String nameAnswer = "com.acorn.AnswerMapper.";
	 	
	   
	   
	    public List<StoreDTO> selectAll() throws Exception {
	    	System.out.println("good");
	        return session.selectList(namespace+"test1");
	    }
	    
	    public StoreDTO select(String storeCode) {
	    	return session.selectOne(namespace+"test2",storeCode);
	    }

		@Override
		public StoreDTO selectStoreSubInfo(String storeCode) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int updateStoreSubInfo(StoreDTO store) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<ReviewDTO> selectAllReview() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AnswerDTO insertAnswer(String AnswerContent) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int updateAnswer(String AnswerContent) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public AnswerDTO deleteAnswer(String AnswerCode) {
			// TODO Auto-generated method stub
			return null;
		}

	
	   
	   
	 	
	   
		   
	 



	    

	    
}