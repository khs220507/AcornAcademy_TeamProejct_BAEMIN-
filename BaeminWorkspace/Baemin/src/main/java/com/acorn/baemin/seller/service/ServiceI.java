package com.acorn.baemin.seller.service;

import java.util.List;

import com.acorn.baemin.seller.domain.SellerDTO;
import com.acorn.baemin.store.AnswerDTO;
import com.acorn.baemin.store.StoreDTO;
import com.acorn.baemin.domain.ReviewDTO;

public interface ServiceI {
	// 餓ο옙占쎄묶
	
	// 占쎄묶沃섓옙
	// 筌띲끉�삢占쎌젟癰귨옙 1揶쏉옙 鈺곌퀬�돳
	public StoreDTO selectStoreOne(String storeCode);
	// 筌띲끉�삢占쎌젟癰귨옙 占쎈땾占쎌젟
	public int modifingStoreSubInfo(StoreDTO store);
	// �뵳�됰윮�꽴占썹뵳�뗪틙
	// �뵳�됰윮 占쎌읈筌ｏ옙 筌뤴뫖以� 鈺곌퀬�돳
	public List<ReviewDTO> getAllReview();
	// �뵳�됰윮 1椰꾨똻肉� 占쏙옙占쎈립 占쎈뼗癰귨옙 占쎈쾻嚥∽옙
	public AnswerDTO regiAnswer(String answerContent);
	// 占쎈뼗癰귨옙 占쎈땾占쎌젟
	public AnswerDTO modifingAnswer(String answerContent);
	// 占쎈뼗癰귨옙 占쎄텣占쎌젫
	public AnswerDTO deleteAnswer(String answerCode);
}
