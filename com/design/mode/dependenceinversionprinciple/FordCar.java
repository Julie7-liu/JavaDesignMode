package com.design.mode.dependenceinversionprinciple;

public class FordCar implements ICar {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("���ؿ�ʼ������");
	}

	@Override
	public void Trun() {
		// TODO Auto-generated method stub
		System.out.println("���ؿ�ʼת����");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("���ؿ�ʼͣ����");
	}

}