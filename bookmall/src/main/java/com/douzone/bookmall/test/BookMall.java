package com.douzone.bookmall.test;

public class BookMall {

	public static void main(String[] args) {
		CategoryDao categoryDao = new CategoryDao().insert();
		categoryDao.insert();
		categoryDao.insert();
		List list = categoryDao.findAll();
		for(Category)

	}

}
