package com.douzone.bookmall.vo;

public class CartVo {
	private int ea;
	private Long customer_no;
	private Long book_no;
	private Long price;
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;

	public Long getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(Long customer_no) {
		this.customer_no = customer_no;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	@Override
	public String toString() {
		return "CartVo [ea=" + ea + ", customer_no=" + customer_no + ", book_no=" + book_no + ", price=" + price
				+ ", name=" + name + "]";
	}
	
}
