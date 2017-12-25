package com.design.mode.state;

public class ConcreteStateB extends State {

	@Override
	public void Handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}

}
