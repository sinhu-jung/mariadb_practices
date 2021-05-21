package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.OrderDao;
import com.douzone.bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		OrderVo vo = null;
		
		vo = new OrderVo();
		vo.setPrice(27000L);
		vo.setDelivery("부산광역시 남구 동명로 92번길 56-10 413호");
		vo.setOrdernum("2019051620493374");
		vo.setCustomer_no(1L);
		new OrderDao().insert(vo);
	}

}
