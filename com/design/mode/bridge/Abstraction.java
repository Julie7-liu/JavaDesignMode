package com.design.mode.bridge;

public class Abstraction {
	protected Implementor implementor;

	public void SetImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void Operation() {
		implementor.Operation();
	}
}
