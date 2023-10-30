package com.acorn.baemin.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
import com.acorn.baemin.store.StoreDTO;

@Service
public class SellerService implements ServiceI{

	@Autowired
	SellerRepository dao;
	
	// 태민
	// 매장정보탭
	// 매장정보 1개 조회
	@Override
	public StoreDTO selectStoreOne(String storeCode) {
		return dao.selectStoreSubInfo(storeCode);
	}
	// 매장정보 수정
	@Override
	public int modifingStoreSubInfo(StoreDTO store) {
		return dao.updateStoreSubInfo(store);
	}
	
	// 리뷰탭
	// 리뷰 전체목록 조회
	@Override
	public List<ReviewDTO> getAllReview() {
		return dao.selectAllReview();
	}
	// 리뷰 1건에 대한 답변 등록
	@Override
	public AnswerDTO regiAnswer(String answerContent) {
		return dao.insertAnswer(answerContent);
	}
	// 답변 수정
	@Override
	public AnswerDTO modifingAnswer(String answerContent) {
		return dao.updateAnswer(answerContent);
	}
	// 답변 삭제
	@Override
	public AnswerDTO deleteAnswer(String answerCode) {
		return dao.deleteAnswer(answerCode);
	}
}
