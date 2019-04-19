package com.example.signUp.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.example.signUp.member.model.vo.Member;

public interface MemberDao
{

	String selectMember(SqlSessionTemplate sqlSession, String userId);

	int insertMember(SqlSessionTemplate sqlSession, Member m);
	
}