package com.bowen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClientTest {

	public static void main(String[] args) {
		//读取客户端的配置文件
	    ApplicationContext context=new ClassPathXmlApplicationContext("com/bowen/test/clientTest.xml");
	    StudentInterface st=context.getBean("myClient",StudentInterface.class);
	    st.syaHello();
	}

}
