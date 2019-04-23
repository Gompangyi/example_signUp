package com.example.signUp.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.signUp.member.model.service.MemberService;
import com.example.signUp.member.model.vo.Member;

@Controller
public class MemberController
{
	@Autowired
	public MemberService ms;
	
	/* 콘솔 출력용 로거. logback.xml의 root 설정값이 적용됨 */
	private static final Logger consoleLogger = LoggerFactory.getLogger(MemberController.class);
	
	private static final Logger fileLogger = LoggerFactory.getLogger("com.example.signUp");
	
	@RequestMapping("/insert.me")
	public String insertMember(Member m)
	{	
		consoleLogger.trace("console : trace");
		consoleLogger.debug("console : debug");
		consoleLogger.info("console : info");
		consoleLogger.warn("console : warn");
		consoleLogger.error("console : error");
		
//		ms.insertMember(m);
		
		consoleLogger.error("LOGGING_EVENT 테이블 Insert 테스트");
		
		MDC.clear();
		MDC.put("TEST_ID_1",  "TEST_VALUE");
		consoleLogger.error("LOGGING_EVENT_PROPERTY 테스트", MDC.getCopyOfContextMap());
		
		consoleLogger.error("[LOGGING_EXCEPTION 테이블 Insert 테스트 : {}]", new NullPointerException("NullPointerException"));
		
		return "home";
	}
	
	@ResponseBody
	@RequestMapping("select.me")
	public String selectMember(@RequestParam(value = "userId")String userId)
	{
		return ms.selectMember(userId);
	}
}