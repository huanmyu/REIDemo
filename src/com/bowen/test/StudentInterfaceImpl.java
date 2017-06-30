package com.bowen.test;

public class StudentInterfaceImpl implements StudentInterface{

	@Override
	
	public void syaHello() {
		Student s=new Student(1,"bowen",24,"男","龙牙山");
		System.out.println("Hello Bowen,nice to meet you!");
		System.out.println("I am "+s.getName()+",and "+s.getAge()+", I live in "+s.getAddress());
		
	}

}
