package com.design.mode.mediator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator m = new ConcreteMediator();

		//����������ͬ������ʶ�н��߶���
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);

		//���н�����ʶ��������ͬ�������
		m.setColleague1(c1);
		m.setColleague2(c2);

		//����ͬ�������ķ�����Ϣ����ͨ���н���ת��
		c1.Send("�Թ�������?");
		c2.Send("û���أ��������ͣ�");
	}

}
