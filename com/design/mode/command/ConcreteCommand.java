package com.design.mode.command;

//ConcreteCommand�࣬��һ�������߶������һ�����������ý�������Ӧ�Ĳ�����ʵ��Execute
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
