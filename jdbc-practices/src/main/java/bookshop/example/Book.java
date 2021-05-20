package bookshop.example;

public class Book {
	private int bookNo;
	private int stateCode;
	private String title;
	private String author;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.author = author;
		this.title = title;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void rent() {
		System.out.println(title + "이(가) 대여 됐습니다.");
		this.stateCode = 0;
	}

	public void print() {
		String state;
		if(stateCode>0) {
			state = "재고있음";
		}
		else {
			state = "대여중";
		}
		System.out.println("책 재목:" + title + ", 작가:" + author + ", 대여 유무:"+ state);
	}
	
	
	
}
