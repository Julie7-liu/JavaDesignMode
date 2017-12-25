package com.design.mode.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	//发送信息时通常是中介者发出去的
	public void Send(String message)
	{
		mediator.Send(message, this);
	}
	
	public void Notify(String message)
	{
		System.out.println("同事2得到信息："+message);
	}
	
 
}
