package com.acorn.baemin.seller.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.StoreDTO;



@Repository
public class SellerRepository implements SellerRepositoryI{
	 	// @Autowired
	    private SqlSession session;
	 	
	    private static String namespace = "com.acorn.SellerMapper.";
	    private static String namespaceStore = "com.acorn.StoreMapper.";
	    private static String namespaceReview = "com.acorn.ReviewMapper.";
	    private static String nameAnswer = "com.acorn.AnswerMapper.";
		   
	   
	    // 준태
	   
	    
	    // 태민
	    
	    // 매장정보관리탭
	    // 매장정보 1개 조회
	    @Override
	    public StoreDTO selectStoreSubInfo(String storeCode) {
	    	System.out.println("success selectStoreSubInfo()");
			return session.selectOne(namespaceStore+"selectStoreSubInfo", storeCode);
	    }	    
	    
	    // 매장 정보 수정
	    @Override
	    public int updateStoreSubInfo(StoreDTO store) {
	    	System.out.println("success updateStoreSubInfo()");
			return session.update(namespaceStore+"update", store);
	    }

	    
	    // 리뷰관리탭
	    // 리뷰 전체 목록 조회
	    @Override
	    public List<ReviewDTO> selectAllReview() throws Exception {
	    	System.out.println("success selectAllReviews()");
	        return session.selectList(namespaceReview+"selectAll");
	    }
	    
	    // 리뷰 1건에 대한 답변 등록
		@Override
	    public AnswerDTO insertAnswer(String answerContent) {
	    	System.out.println("success insertAnswer()");
			return session.insert(nameAnswer, answerContent);
	    }
	    
	    // 답변 수정
	    @Override
	    public int updateAnswer(String answerContent) {
	    	System.out.println("success updateAnswer()");
			return session.update(nameAnswer+"update", answerContent);
	    }
	    
	    // 답변 삭제
	    @Override
	    public AnswerDTO deleteAnswer(String answerCode) {
	    	System.out.println("success deleteAnswer()");
			return session.delete(nameAnswer+"delete");
	    }




	    
	    
}