package com.douzone.bookmall.vo;

public class CartVo {
	private Long no;
	private int ea;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", ea=" + ea + "]";
	}
	
}
