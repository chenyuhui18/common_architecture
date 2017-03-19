package com.cyh.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyh.demo.dao.UserDao;
import com.cyh.demo.model.UserEntity;
import com.cyh.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserEntity findUserById(long id) {
		UserEntity user= userDao.findUserById(id);
		return user;
	}

}
