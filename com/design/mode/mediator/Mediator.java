package com.design.mode.mediator;

//�����н��ߣ�������ͬ�¶����н��߶���Ľӿ�
public abstract class Mediator {
	//����һ������ķ�����Ϣ�������õ�ͬ�¶���ͷ�����Ϣ
public abstract void Send(String message,Colleague colleague);
}
