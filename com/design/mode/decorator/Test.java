package com.design.mode.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConcreteComponent c=new ConcreteComponent();
ConcreteDecoratorA a=new ConcreteDecoratorA();
ConcreteDecoratorB b=new ConcreteDecoratorB();

a.SetComponent(c);
b.SetComponent(a);
a.Operation();
System.out.println("-----------------");
b.Operation();
	}

}
