package com.example.signUp.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.signUp.member.model.dao.MemberDao;
import com.example.signUp.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService
{

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private MemberDao md;
	/*
	 * @Autowired private DataSourceTransactionManager transactionManager;
	 */
	
	@Override
	public String selectMember(String userId)
	{
		return md.selectMember(sqlSession, userId);
	}

	@Override
	public int insertMember(Member m)
	{
		return md.insertMember(sqlSession, m);
	}
}