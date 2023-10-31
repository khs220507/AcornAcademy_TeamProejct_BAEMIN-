package com.acorn.baemin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
