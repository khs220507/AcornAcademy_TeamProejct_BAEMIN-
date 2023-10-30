package com.acorn.baemin.seller.repository;

import java.util.List;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.StoreDTO;


public interface SellerRepositoryI {
	// 준태
	
	// 태민
	// 매장정보탭
	// 매장정보 1개 조회
	public StoreDTO selectStoreSubInfo(String storeCode);
	// 매장정보 수정
	public int updateStoreSubInfo(StoreDTO store);
	
	// 리뷰관리탭
	// 리뷰 전체 목록 조회
	public List<ReviewDTO> selectAllReview();
	// 리뷰 1건에 대한 답변 등록
	public AnswerDTO insertAnswer(String AnswerContent);
	// 답변 수정
	public int updateAnswer(String AnswerContent);
	// 답변 삭제
	public AnswerDTO deleteAnswer(String AnswerCode);
	
}
