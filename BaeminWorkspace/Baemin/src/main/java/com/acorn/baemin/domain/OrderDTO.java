package com.acorn.baemin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	int  orderNumber;
	int userCode;
	int storeCode;
<<<<<<< HEAD
=======
	String orderMenuName;
	int orderMenuNumber;
	int orderMenuPrice;
	String orderStoreName;
	String orderStoreImage;
>>>>>>> f880ac08703c011308f9419419520cca3f432121
	String orderDate;
	int payType;
	int orderType;
	String reqToSeller;
	String reqToRider;
	String orderStatus;
}
