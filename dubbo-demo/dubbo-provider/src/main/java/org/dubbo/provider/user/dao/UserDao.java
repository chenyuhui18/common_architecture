package org.dubbo.provider.user.dao;

import org.dubbo.api.model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao {
	
	UserEntity findUserById(long id);
	
}
