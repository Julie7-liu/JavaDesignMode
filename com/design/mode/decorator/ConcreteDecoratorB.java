package com.design.mode.decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void AddedBehavior() {
		System.out.println("AddedBehavior");
	}
}
