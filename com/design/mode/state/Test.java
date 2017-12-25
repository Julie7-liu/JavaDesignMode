package com.design.mode.state;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c = new Context(new ConcreteStateA());
		c.Request();
		c.Request();
		c.Request();
		c.Request();
	}

}
