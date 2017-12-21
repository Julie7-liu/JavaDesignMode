package com.design.mode.dependenceinversionprinciple;

public class BmwCar implements ICar {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("宝马开始启动了");
	}

	@Override
	public void Trun() {
		// TODO Auto-generated method stub
		System.out.println("宝马开始转弯了");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马开始停车了");
	}

}
