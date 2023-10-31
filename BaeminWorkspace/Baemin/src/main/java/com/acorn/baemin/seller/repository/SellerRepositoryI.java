package com.acorn.baemin.seller.repository;

import java.util.List;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.AnswerDTO;
import com.acorn.baemin.store.StoreDTO;
import com.acorn.baemin.user.domain.ReviewDTO;


public interface SellerRepositoryI {
	
	public StoreDTO selectStoreSubInfo(String storeCode);
	
	public int updateStoreSubInfo(StoreDTO store);
	
	
	public List<ReviewDTO> selectAllReview();
	
	public AnswerDTO insertAnswer(String AnswerContent);
	
	public int updateAnswer(String AnswerContent);
	
	public AnswerDTO deleteAnswer(String AnswerCode);
	
}
