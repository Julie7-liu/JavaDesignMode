package com.design.mode.facade;

public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;

	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void MethodA()
	{
		System.out.println("\n方法组A()----");
		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();
	}
	public void MethodB()
	{
		System.out.println("\n方法组B()----");
		two.MethodTwo();
		three.MethodThree();
	}
}
