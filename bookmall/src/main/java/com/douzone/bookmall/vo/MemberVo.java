package com.douzone.bookmall.vo;

public class MemberVo {
	private Long no;
	private String name;
	private String phone_num;
	private String email;
	private String passwd;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", name=" + name + ", phone_num=" + phone_num + ", email=" + email + ", passwd="
				+ passwd + "]";
	}
	
	

}
