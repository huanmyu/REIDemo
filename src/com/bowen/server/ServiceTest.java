package com.bowen.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("服务器程序开启");
		new ClassPathXmlApplicationContext("com/bowen/server/rmiServer.xml");

	}

}
