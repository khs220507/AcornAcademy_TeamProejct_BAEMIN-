package com.acorn.baemin.user;

import java.util.List;

public interface UserRepositoryI {

	public List<UserDTO> selectAll() throws Exception;

	public boolean loginCustomer(String unputId, String inputPw) throws Exception;

	// 로그인
	public String login();

	// 홈
	public String home();

	// 가입 선택
	public String selectSignup();

	// 회원가입(고객)
	public String customerSignup();

	// 고객홈(로그인 후)
	public String customerHome();

	// 로그아웃
	public String logout();

	// 내정보수정(고객)
	public String customerModify();

}
