package com.design.mode.decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;// �������еĶ��й��ܣ���������ConcreteDecoratorB

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		addedState = "New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}

}
