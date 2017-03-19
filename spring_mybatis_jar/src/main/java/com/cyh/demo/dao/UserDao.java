package com.cyh.demo.dao;

import org.springframework.stereotype.Repository;

import com.cyh.demo.model.UserEntity;

@Repository("userDao")
public interface UserDao {
	
	UserEntity findUserById(long id);
	
}
