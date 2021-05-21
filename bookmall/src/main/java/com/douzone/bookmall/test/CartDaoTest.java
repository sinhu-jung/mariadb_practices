package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
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

}
