package com.design.mode.memento;

/*
 * ����¼������洢Originator������ڲ�״̬�����ɷ�ֹOriginator���������������ʱ���¼��
 * ����¼�������ӿ�,Caretakerֻ�ܿ�������¼��խ�ӿڣ���ֻ�ܽ�����¼���ݸ���������
 * Originator�ܹ�����һ����ӿڣ����������ʷ��ص���ǰ״̬�������������*/
public class Memento {
	private String state;

	// ��Ҫ������������ԣ������Ƕ��
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// ���췽������������ݵ���
	public Memento(String state) {
		this.setState(state);
	}
}
