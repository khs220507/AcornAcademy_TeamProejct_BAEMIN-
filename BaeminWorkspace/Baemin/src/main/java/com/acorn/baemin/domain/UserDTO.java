package com.acorn.baemin.domain;

import com.acorn.baemin.domain.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

	int userCode;
	String userId;
	String userPw;
	String userName;
	String userNickname;
	String userPhone;
	String userAdress;
	String userEmail;
	String userBirth;
	int userGender;
	int userStatus;


}
