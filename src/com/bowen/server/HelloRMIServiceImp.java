package com.bowen.server;

public class HelloRMIServiceImp implements HelloRMIService {

	@Override
	public int getAdd(int a, int b) {
		return a+b;
	}

}
