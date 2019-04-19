package com.example.signUp.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.signUp.member.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao
{

	@Override
	public String selectMember(SqlSessionTemplate sqlSession, String userId)
	{
		return sqlSession.selectOne("Member.selectMember", userId);
	}

	@Override
	public int insertMember(SqlSessionTemplate sqlSession, Member m)
	{
		return sqlSession.insert("Member.insertMember", m);
	}
}
