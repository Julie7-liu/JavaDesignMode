package com.design.mode.proxy;

public class Proxy extends Subject{

	RealSubject realSubject;
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if(realSubject==null)
		{
			realSubject=new RealSubject();
		}
		realSubject.Request();
	}

}
