package com.design.mode.mediator;

//�����н��߶���ʵ�ֳ�����ķ���������Ҫ֪�����о���ͬ���࣬���Ӿ���ͬ�½�����Ϣ�������ͬ�¶��󷢳����
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
