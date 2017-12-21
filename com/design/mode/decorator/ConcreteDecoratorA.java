package com.design.mode.decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;// 本来具有的独有功能，以区别于ConcreteDecoratorB

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作");
	}

}
