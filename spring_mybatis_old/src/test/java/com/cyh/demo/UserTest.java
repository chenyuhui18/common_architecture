package com.cyh.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.demo.model.UserEntity;
import com.cyh.demo.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class)  
@ContextConfiguration(value = "classpath:all.xml")
public class UserTest extends AbstractJUnit4SpringContextTests{
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void getUserTest(){
		UserEntity user=userService.findUserById(1L);
		System.out.println(user.getName());
	}
	
}
