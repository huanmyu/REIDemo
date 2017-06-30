package com.bowen.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuentServerTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	//读取服务器端的配置文件，开启服务器
	new ClassPathXmlApplicationContext("com/bowen/test/serverTest.xml");

	}

}
