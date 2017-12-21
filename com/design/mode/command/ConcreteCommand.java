package com.design.mode.command;

//ConcreteCommand类，将一个接收者对象绑定于一个动作，调用接收者相应的操作以实现Execute
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		receiver.Action();
	}

}
