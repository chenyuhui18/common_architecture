package com.cyh.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.demo.model.UserEntity;
import com.cyh.demo.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class)  
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class UserTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserTest(){
		UserEntity user=userService.findUserById(1L);
		System.out.println(user.getName());
	}
	
}
