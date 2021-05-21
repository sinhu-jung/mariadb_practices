package com.douzone.bookmall.vo;

public class OrderVo {
	private Long no;
	private Long price;
	private String delivery;
	private String ordernum;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", price=" + price + ", delivery=" + delivery + ", ordernum=" + ordernum + "]";
	}
	

}
