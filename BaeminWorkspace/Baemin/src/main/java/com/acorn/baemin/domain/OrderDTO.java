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
	String orderDate;
	int payType;
	int orderType;
	String reqToSeller;
	String reqToRider;
	String orderStatus;
	String orderMenuName;
	int orderMenuNumber;
	int orderMenuPrice;
	String orderStoreName;
	String orderStoreImage;
}
