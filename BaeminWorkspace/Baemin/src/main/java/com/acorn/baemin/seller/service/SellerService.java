package com.acorn.baemin.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
import com.acorn.baemin.store.AnswerDTO;
import com.acorn.baemin.store.StoreDTO;
import com.acorn.baemin.domain.ReviewDTO;

@Service
public class SellerService implements ServiceI{

	@Autowired
	SellerRepository dao;
	
	// 占쎄묶沃섓옙
	// 筌띲끉�삢占쎌젟癰귣똾爰�
	// 筌띲끉�삢占쎌젟癰귨옙 1揶쏉옙 鈺곌퀬�돳
	@Override
	public StoreDTO selectStoreOne(String storeCode) {
		return dao.selectStoreSubInfo(storeCode);
	}
	// 筌띲끉�삢占쎌젟癰귨옙 占쎈땾占쎌젟
	@Override
	public int modifingStoreSubInfo(StoreDTO store) {
		return dao.updateStoreSubInfo(store);
	}
	@Override
	public List<ReviewDTO> getAllReview() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AnswerDTO regiAnswer(String answerContent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AnswerDTO modifingAnswer(String answerContent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AnswerDTO deleteAnswer(String answerCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
