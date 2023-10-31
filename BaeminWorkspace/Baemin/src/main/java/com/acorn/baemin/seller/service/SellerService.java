package com.acorn.baemin.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.baemin.domain.SellerDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.domain.ReviewDTO;

@Service
public class SellerService implements ServiceI{

	@Autowired
	SellerRepository dao;
	
	// �깭誘�
	// 留ㅼ옣�젙蹂댄꺆
	// 留ㅼ옣�젙蹂� 1媛� 議고쉶
	@Override
	public StoreDTO selectStoreOne(String storeCode) {
		return dao.selectStoreSubInfo(storeCode);
	}
	// 留ㅼ옣�젙蹂� �닔�젙
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
