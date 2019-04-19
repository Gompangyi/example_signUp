package com.example.signUp.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.signUp.member.model.service.MemberService;
import com.example.signUp.member.model.vo.Member;

@Controller
public class MemberController
{
	@Autowired
	public MemberService ms;
	
	@RequestMapping("insert.me")
	public String insertMember(Member m)
	{
		ms.insertMember(m);
		
		return "home";
	}
	
	@ResponseBody
	@RequestMapping("select.me")
	public String selectMember(@RequestParam(value = "userId")String userId)
	{
		return ms.selectMember(userId);
	}
}