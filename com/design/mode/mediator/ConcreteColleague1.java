package com.design.mode.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	//������Ϣʱͨ�����н��߷���ȥ��
	public void Send(String message)
	{
		mediator.Send(message, this);
	}
	
	public void Notify(String message)
	{
		System.out.println("ͬ��1�õ���Ϣ��"+message);
	}
	
 
}
