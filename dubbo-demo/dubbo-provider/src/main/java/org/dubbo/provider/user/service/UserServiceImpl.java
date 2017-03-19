package org.dubbo.provider.user.service;

import org.dubbo.api.model.UserEntity;
import org.dubbo.api.service.UserService;
import org.dubbo.provider.user.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
