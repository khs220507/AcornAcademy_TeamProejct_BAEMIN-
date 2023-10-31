package com.acorn.baemin.cart.domain;

import com.acorn.baemin.domain.CartDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTOTest {

	int cartCode;
	String userId;
	int storeCode;
	int meneCount;
	int menuCode;
	
}
