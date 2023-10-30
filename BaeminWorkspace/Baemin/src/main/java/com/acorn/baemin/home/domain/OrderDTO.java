package com.acorn.baemin.home.domain;

import lombok.Data;

@Data
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
	
	
}
