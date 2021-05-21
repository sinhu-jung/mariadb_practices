package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.MemberDao;
import com.douzone.bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<MemberVo> list = new MemberDao().findAll();
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
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

}
