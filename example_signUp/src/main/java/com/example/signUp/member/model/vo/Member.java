package com.example.signUp.member.model.vo;

import lombok.Data;

@Data
public class Member
{
	private int user_number;
	private String user_id;
	private String user_pwd;
	private String user_name;
	private String gender;
	private String email;
}