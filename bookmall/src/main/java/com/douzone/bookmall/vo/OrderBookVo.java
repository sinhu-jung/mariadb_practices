package com.douzone.bookmall.vo;

public class OrderBookVo {
	private int book_ea;
	private Long price;
	private Long book_no;
	private Long order_no;
	private String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	public Long getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Long order_no) {
		this.order_no = order_no;
	}
	public int getBook_ea() {
		return book_ea;
	}
	public void setBook_ea(int book_ea) {
		this.book_ea = book_ea;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderBookVo [book_ea=" + book_ea + ", price=" + price + ", book_no=" + book_no + ", order_no="
				+ order_no + ", title=" + title + "]";
	}
}
