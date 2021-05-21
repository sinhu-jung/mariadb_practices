package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();

	}

	private static void findAllTest() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
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

}
