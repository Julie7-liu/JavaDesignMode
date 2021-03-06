package com.design.mode.command;

//用来声明执行操作的接口
public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	abstract public void Execute();
}
