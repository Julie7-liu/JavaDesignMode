package com.design.mode.state;

public class ConcreteStateA extends State {

	@Override
	public void Handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
	}

}
