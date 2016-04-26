package com.mcredit.model;

/**
 * 用户
 * @author liang
 *
 */
public class User {

	private int id;
	private String loginname;
	private String password;
	private String username;
	private String brchno;
	private String status;

	public User() {

	}

	public User(String loginname, String password, String username, String brchno, String status) {
		this.loginname = loginname;
		this.password = password;
		this.username = username;
		this.brchno = brchno;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBrchno() {
		return brchno;
	}

	public void setBrchno(String brchno) {
		this.brchno = brchno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
