package com.xiangwei.atcrowdfunding.bean;

public class User {
 
	private Integer id;
	private String  username;
	
	private String loginacct; 
	 private String userpswd;
	
	
	public String getLoginacct() {
		return loginacct;
	}
	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}
	public String getUserpswd() {
		return userpswd;
	}
	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public User() {
		super();
	}
	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	
	public User(Integer id, String username, String loginacct, String userpswd) {
		super();
		this.id = id;
		this.username = username;
		this.loginacct = loginacct;
		this.userpswd = userpswd;
	}
	
	
	
	public User(String loginacct, String userpswd) {
		super(); //µÇÂ½ÓÃ
		this.loginacct = loginacct;
		this.userpswd = userpswd;
	}
	public User(String username, String loginacct, String userpswd) {
		super();
		this.username = username;
		this.loginacct = loginacct;
		this.userpswd = userpswd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginacct=" + loginacct + ", userpswd=" + userpswd
				+ "]";
	}
	
	
}
