package com.douzone.bookmall.vo;

public class BookVo {
	private Long no;
	private String title;
	private Long price;
	private Long categori_num;
	public Long getCategori_num() {
		return categori_num;
	}
	public void setCategori_num(Long categori_num) {
		this.categori_num = categori_num;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", price=" + price + ", categori_num=" + categori_num + "]";
	}
	
}
