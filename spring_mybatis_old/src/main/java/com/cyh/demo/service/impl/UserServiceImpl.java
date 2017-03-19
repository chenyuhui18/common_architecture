package com.cyh.demo.service.impl;

import com.cyh.demo.dao.UserDao;
import com.cyh.demo.model.UserEntity;
import com.cyh.demo.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserEntity findUserById(long id) {
		return userDao.findUserById(id);
	}

}
