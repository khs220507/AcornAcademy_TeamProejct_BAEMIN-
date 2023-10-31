package com.acorn.baemin.user.repository;

import java.util.List;

import com.acorn.baemin.domain.UserDTO;

public interface LoginRepositoryI {

	// Ȩ(�����)
	public String sellerHome();

	// ȸ������(�����)
	public String sellerSignup();

	// �α���(�����)
	public String sellerLogin();

	// ����������(�����)
	public String sellerModify();
	
	public List<UserDTO> selectAll() throws Exception;

	public boolean loginCustomer(String unputId, String inputPw) throws Exception;

	// �α���
	public String login();

	// Ȩ
	public String home();

	// ���� ����
	public String selectSignup();

	// ȸ������(��)
	public String customerSignup();

	// ��Ȩ(�α��� ��)
	public String customerHome();

	// �α׾ƿ�
	public String logout();

	// ����������(��)
	public String customerModify();

	
}
