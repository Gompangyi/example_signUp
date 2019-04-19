package com.example.signUp.member.model.service;

import com.example.signUp.member.model.vo.Member;

public interface MemberService
{

	String selectMember(String userId);

	int insertMember(Member m);


}