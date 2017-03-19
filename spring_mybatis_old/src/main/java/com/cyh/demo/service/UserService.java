package com.cyh.demo.service;

import com.cyh.demo.model.UserEntity;

public interface UserService {
	UserEntity findUserById(long id);
}
