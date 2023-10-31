package com.acorn.baemin.home.domain;

import com.acorn.baemin.domain.CartDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartMenuDTO {

	// Cart
	int cartCode;
	int userCode;
	int storeCode;
	int optionCode; 
	int menuCount;
	int cartPrice;
	int optionStatus;
	
	// Menu
	int menuCode;
	String menuName;
	int menuPrice;
	String menuImage;
	String menuContent;
	String menuClassification;

	int menuStatus;
	

}
