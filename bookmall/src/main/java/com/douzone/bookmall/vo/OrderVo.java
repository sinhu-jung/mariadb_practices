package com.douzone.bookmall.vo;

public class OrderVo {
	private Long no;
	private Long price;
	private Long customer_no;
	private String delivery;
	private String ordernum; 
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(Long customer_no) {
		this.customer_no = customer_no;
	}
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
		return "OrderVo [no=" + no + ", price=" + price + ", customer_no=" + customer_no + ", delivery=" + delivery
				+ ", ordernum=" + ordernum + ", name=" + name + ", email=" + email + "]";
	}
	

}
