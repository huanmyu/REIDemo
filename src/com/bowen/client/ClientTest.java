package com.bowen.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bowen.server.HelloRMIService;

public class ClientTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bowen/client/client.xml");
		HelloRMIService hms=context.getBean("myClient",HelloRMIService.class);
		int sum=hms.getAdd(20, 10);
		System.out.println("计算的结果是："+sum);
	}

}
