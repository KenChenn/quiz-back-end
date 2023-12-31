package com.example.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@:annotation
@Entity //找到這張表
@Table(name = "user")
public class User {
	
	@Id //id是指pk的欄位
	@Column(name = "account")
	private String account;

	@Column(name = "password")
	private String pwd;

	public User() {
		super();
	}

	public User(String account, String pwd) {
		super();
		this.account = account;
		this.pwd = pwd;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
