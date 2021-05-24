package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.dao.CategoryDao;
import com.douzone.bookmall.dao.MemberDao;
import com.douzone.bookmall.dao.OrderBookDao;
import com.douzone.bookmall.dao.OrderDao;
import com.douzone.bookmall.vo.BookVo;
import com.douzone.bookmall.vo.CartVo;
import com.douzone.bookmall.vo.CategoryVo;
import com.douzone.bookmall.vo.MemberVo;
import com.douzone.bookmall.vo.OrderBookVo;
import com.douzone.bookmall.vo.OrderVo;

public class BookMall {

	public static void main(String[] args) {
		//insertinfo();
		displayinfo();
	}
	
	

	private static void insertinfo() {
		categoryInsert();
		bookInsert();
		memberInsert();
		cartInsert();
		orderInsert();
		orderBookInsert();
	}

	private static void orderBookInsert() {
		OrderBookVo vo = null;
		
		vo = new OrderBookVo();
		vo.setBook_ea(3);
		vo.setPrice(27000L);
		vo.setBook_no(1L);
		vo.setOrder_no(1L);
		new OrderBookDao().insert(vo);
		
		vo = new OrderBookVo();
		vo.setBook_ea(6);
		vo.setPrice(31500L);
		vo.setBook_no(2L);
		vo.setOrder_no(1L);
		new OrderBookDao().insert(vo);
	}

	private static void orderInsert() {
		OrderVo vo = null;
		
		vo = new OrderVo();
		vo.setPrice(27000L);
		vo.setDelivery("부산광역시 남구 동명로 92번길 56-10 413호");
		vo.setOrdernum("2019051620493374");
		vo.setCustomer_no(1L);
		new OrderDao().insert(vo);
	}

	private static void cartInsert() {
		CartVo vo = null;
		
		vo = new CartVo();
		vo.setEa(3);
		vo.setCustomer_no(1L);
		vo.setBook_no(1L);
		new CartDao().insert(vo);
		
		vo = new CartVo();
		vo.setEa(6);
		vo.setCustomer_no(1L);
		vo.setBook_no(2L);
		new CartDao().insert(vo);
	}

	private static void memberInsert() {
		MemberVo vo = null;
		
		vo = new MemberVo();
		vo.setName("둘리");
		vo.setPhone_num("010-1234-5678");
		vo.setEmail("enffl@naver.com");
		vo.setPasswd("Ehcl");
		new MemberDao().insert(vo);
		
		vo = new MemberVo();
		vo.setName("마이콜");
		vo.setPhone_num("010-8765-4321");
		vo.setEmail("akdlzhf@naver.com");
		vo.setPasswd("ehdnsj");
		new MemberDao().insert(vo);
	}

	private static void bookInsert() {
		BookVo vo = null;
		
		vo = new BookVo();
		vo.setCategori_num(1L);
		vo.setTitle("이것이 자바다");
		vo.setPrice(30000L);
		new BookDao().insert(vo);
		
		vo = new BookVo();
		vo.setCategori_num(1L);
		vo.setTitle("스프링 인 액션");
		vo.setPrice(35000L);
		new BookDao().insert(vo);
		
		vo = new BookVo();
		vo.setCategori_num(2L);
		vo.setTitle("달러구트 꿈 백화점");
		vo.setPrice(13800L);
		new BookDao().insert(vo);
	}

	private static void categoryInsert() {
		CategoryVo vo = null;
		
		vo = new CategoryVo();
		vo.setGenre("컴퓨터/IT");
		new CategoryDao().insert(vo);
		
		vo = new CategoryVo();
		vo.setGenre("소설");
		new CategoryDao().insert(vo);
		
		vo = new CategoryVo();
		vo.setGenre("경제");
		new CategoryDao().insert(vo);
	}



	private static void displayinfo() {
		System.out.println("*****카테고리 정보 출력하기*****");
		List<CategoryVo> category_list = new CategoryDao().findAll();
		for(CategoryVo vo :category_list) {
			String category = String.format("[%d] 장르명: %s", vo.getNo(), vo.getGenre());
			System.out.println(category);
		}
		
		System.out.println();
		System.out.println("*****도서 정보 출력하기*****");
		List<BookVo> book_list = new BookDao().findAll();
		for(BookVo vo :book_list) {
			String book = String.format("[%d] 책 제목: %s, 책 가격: %d", vo.getNo(), vo.getTitle(), vo.getPrice());
			System.out.println(book);
		}
		
		System.out.println();
		System.out.println("*****고객 정보 출력하기*****");
		List<MemberVo> member_list = new MemberDao().findAll();
		for(MemberVo vo : member_list) {
			String customer = String.format("[%d] 고객 이름: %s, 전화 번호: %s, 이메일: %s, 비밀번호: %s", vo.getNo(), vo.getName(), vo.getPhone_num(), vo.getEmail(), vo.getPasswd());
			System.out.println(customer);
		}
		
		System.out.println();
		System.out.println("*****카트 정보 출력하기*****");
		List<CartVo> cart_list = new CartDao().findAll();
		for(CartVo vo : cart_list) {
			String cart = String.format("책 제목: %s, 책 수량: %d, 책 가격: %d", vo.getName(), vo.getEa(), vo.getPrice());
			System.out.println(cart);
		}
		
		System.out.println();
		System.out.println("*****주문 정보 출력하기*****");
		List<OrderVo> order_list = new OrderDao().findAll();
		for(OrderVo vo : order_list) {
			String order = String.format("주문 번호: %s 주문자 이름: %s 주문자 이메일: %s 결제 금액: %d, 배송지: %s", vo.getOrdernum(), vo.getName(), vo.getEmail(), vo.getPrice(), vo.getDelivery());
			System.out.println(order);
		}
		
		System.out.println();
		System.out.println("*****주문도서 정보 출력하기*****");
		List<OrderBookVo> orderbook_list = new OrderBookDao().findAll();
		for(OrderBookVo vo : orderbook_list) {
			String orderbook = String.format("책 번호: %d, 책 제목: %s, 책 수량: %d", vo.getBook_no(), vo.getTitle(), vo.getBook_ea());
			System.out.println(orderbook);
		}
	}
	

}
