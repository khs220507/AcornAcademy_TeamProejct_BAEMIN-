package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.domain.ZzimDTO;
<<<<<<< HEAD
=======


>>>>>>> f880ac08703c011308f9419419520cca3f432121

public interface InterZzimRepository {

	public List<ZzimDTO> zzimSelectAll(int userCode) throws Exception;
	
	public int zzimDelete(int userCode, int storeCode) throws Exception;
}
