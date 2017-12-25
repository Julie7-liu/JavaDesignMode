package com.design.mode.memento;

/*
 * �����ˣ����𴴽�һ������¼Memento�����Լ�¼��ǰʱ�������ڲ�״̬������ʹ�ñ���¼�ظ��ڲ�״̬��
 * Originator�ɸ�����Ҫ����Memento�洢Originator����Щ�ڲ�״̬*/
public class Originator {
	private String state;// ��Ҫ��������ԣ������ж��

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// ��������¼������ǰ��Ҫ�������Ϣ���벢ʵ������һ��Memento����
	public Memento CreateMemento() {
		return (new Memento(state));
	}

	// �ָ�����¼����Memento���벢��������ݻָ�
	public void SetMemento(Memento memento) {
		state = memento.getState();
	}

	// ��ʾ����
	public void Show() {
		System.out.println("State=" + state);
	}
}
