package com.design.mode.mediator;

//抽象同事类
public abstract class Colleague {
protected Mediator mediator;
public Colleague(Mediator mediator)
{
	this.mediator=mediator;//构造方法，得到中介者对象
}
}
