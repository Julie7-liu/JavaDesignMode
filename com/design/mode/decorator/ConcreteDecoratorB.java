package com.design.mode.decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		AddedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}

	private void AddedBehavior() {
		System.out.println("AddedBehavior");
	}
}
