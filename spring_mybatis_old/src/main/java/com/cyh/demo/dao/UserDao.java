package com.cyh.demo.dao;

import com.cyh.demo.model.UserEntity;

public interface UserDao {
	
	UserEntity findUserById(long id);
	
}
