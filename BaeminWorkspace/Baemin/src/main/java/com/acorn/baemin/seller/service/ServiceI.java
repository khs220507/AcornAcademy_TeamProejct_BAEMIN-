package com.acorn.baemin.seller.service;

import java.util.List;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.AnswerDTO;
import com.acorn.baemin.store.StoreDTO;
import com.acorn.baemin.user.domain.ReviewDTO;

public interface ServiceI {
	// 以��깭
	
	// �깭誘�
	// 留ㅼ옣�젙蹂� 1媛� 議고쉶
	public StoreDTO selectStoreOne(String storeCode);
	// 留ㅼ옣�젙蹂� �닔�젙
	public int modifingStoreSubInfo(StoreDTO store);
	// 由щ럭愿�由ы꺆
	// 由щ럭 �쟾泥� 紐⑸줉 議고쉶
	public List<ReviewDTO> getAllReview();
	// 由щ럭 1嫄댁뿉 ���븳 �떟蹂� �벑濡�
	public AnswerDTO regiAnswer(String answerContent);
	// �떟蹂� �닔�젙
	public AnswerDTO modifingAnswer(String answerContent);
	// �떟蹂� �궘�젣
	public AnswerDTO deleteAnswer(String answerCode);
}
