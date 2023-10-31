package com.acorn.baemin.cart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuDTOTest {
	int menuCode;
	String menuName;
	int menuPrice;
	String menuImage;
	String menuContent;
}
