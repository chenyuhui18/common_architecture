package org.dubbo.api.service;

import org.dubbo.api.model.UserEntity;

public interface UserService {
	UserEntity findUserById(long id);
}
