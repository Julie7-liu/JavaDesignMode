package com.design.mode.memento;

/*
 * �����ߣ����𱣴�ñ���¼�����ܶԱ���¼�����ݽ��в�������*/
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
