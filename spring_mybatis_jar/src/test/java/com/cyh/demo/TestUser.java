package com.cyh.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyh.demo.service.UserService;

public class TestUser {
	private static ApplicationContext cxt;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		cxt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService user = (UserService) cxt.getBean("userService");
		System.out.println(user.findUserById(1L).getName());
	}

}
