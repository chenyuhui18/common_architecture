package com.cyh.demo.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cyh.demo.dao.UserDao;
import com.cyh.demo.model.UserEntity;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public UserEntity findUserById(long id) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", id);
		return getSqlSession().selectOne("findUserById", map);
	}

}
