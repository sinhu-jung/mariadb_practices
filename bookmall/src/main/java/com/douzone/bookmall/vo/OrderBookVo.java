package com.douzone.bookmall.vo;

public class OrderBookVo {
	private Long no;
	private int book_ea;
	private Long price;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
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
		return "OrderVo [no=" + no + ", book_ea=" + book_ea + ", price=" + price + "]";
	}
}
