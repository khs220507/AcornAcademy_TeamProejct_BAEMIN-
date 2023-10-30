package com.acorn.baemin.seller.service;

import java.util.List;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.StoreDTO;

public interface ServiceI {
	// 준태
	
	// 태민
	// 매장정보 1개 조회
	public StoreDTO selectStoreOne(String storeCode);
	// 매장정보 수정
	public int modifingStoreSubInfo(StoreDTO store);
	// 리뷰관리탭
	// 리뷰 전체 목록 조회
	public List<ReviewDTO> getAllReview();
	// 리뷰 1건에 대한 답변 등록
	public AnswerDTO regiAnswer(String answerContent);
	// 답변 수정
	public AnswerDTO modifingAnswer(String answerContent);
	// 답변 삭제
	public AnswerDTO deleteAnswer(String answerCode);
}
