package com.acorn.baemin.user;

import lombok.Data;

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

	@Override
	public String toString() {
		return "UserDTO [userCode=" + userCode + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userNickname=" + userNickname + ", userPhone=" + userPhone + ", userAdress=" + userAdress
				+ ", userEmail=" + userEmail + ", userBirth=" + userBirth + ", userGender=" + userGender
				+ ", userStatus=" + userStatus + "]";
	}

	public UserDTO(int userCode, String userId, String userPw, String userName, String userNickname, String userPhone,
			String userAdress, String userEmail, String userBirth, int userGender, int userStatus) {
		super();
		this.userCode = userCode;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userNickname = userNickname;
		this.userPhone = userPhone;
		this.userAdress = userAdress;
		this.userEmail = userEmail;
		this.userBirth = userBirth;
		this.userGender = userGender;
		this.userStatus = userStatus;
	}

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

}
