package com.design.mode.mediator;

//����ͬ����
public abstract class Colleague {
protected Mediator mediator;
public Colleague(Mediator mediator)
{
	this.mediator=mediator;//���췽�����õ��н��߶���
}
}
