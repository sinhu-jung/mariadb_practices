package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.OrderBookDao;
import com.douzone.bookmall.vo.OrderBookVo;

public class OrderBookDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
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

}
