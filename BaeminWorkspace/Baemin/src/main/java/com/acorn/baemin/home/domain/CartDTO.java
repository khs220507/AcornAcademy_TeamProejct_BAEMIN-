package com.acorn.baemin.home.domain;

import lombok.Data;

@Data
public class CartDTO {
	
	int cartCode;
	int userCode;
	int storeCode;
	int menuCode;
	int optionCode; 
	int menuCount;
	int cartPrice;
	int optionStatus;
	
}
