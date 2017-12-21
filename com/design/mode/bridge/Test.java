package com.design.mode.bridge;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab = new RefinedAbstraction();

		ab.SetImplementor(new ConcreteImplementorA());
		ab.Operation();

		ab.SetImplementor(new ConcreteImplementorB());
		ab.Operation();
	}

}
