package org.dubbo.provider;

import org.dubbo.api.model.UserEntity;
import org.dubbo.api.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
