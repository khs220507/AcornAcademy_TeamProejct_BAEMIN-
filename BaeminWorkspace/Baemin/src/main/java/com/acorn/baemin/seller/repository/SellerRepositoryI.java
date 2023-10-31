package com.acorn.baemin.seller.repository;

import java.util.List;

import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.ReviewDTO;
import com.acorn.baemin.domain.StoreDTO;


public interface SellerRepositoryI {
	
	public StoreDTO selectStoreSubInfo(String storeCode);
	
	public int updateStoreSubInfo(StoreDTO store);
	
	
	public List<ReviewDTO> selectAllReview();
	
	public AnswerDTO insertAnswer(String AnswerContent);
	
	public int updateAnswer(String AnswerContent);
	
	public AnswerDTO deleteAnswer(String AnswerCode);
	
}
