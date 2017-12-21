package com.design.mode.dependenceinversionprinciple;

public class FordCar implements ICar {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("福特开始启动了");
	}

	@Override
	public void Trun() {
		// TODO Auto-generated method stub
		System.out.println("福特开始转弯了");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("福特开始停车了");
	}

}