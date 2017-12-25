package com.design.mode.mediator;

//具体中介者对象，实现抽象类的方法，它需要知道所有具体同事类，并从具体同事接收信息，向具体同事对象发出命令。
public class ConcreteMediator extends Mediator {

	private ConcreteColleague1 colleague1;

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	private ConcreteColleague2 colleague2;

	@Override
	public void Send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if (colleague == colleague1) {
			colleague2.Notify(message);
		} else {
			colleague1.Notify(message);
		}
	}

}
