package com.design.mode.chainofresponsibility;

//����һ��������ʾ�Ľӿ�
public abstract class Handler {
	protected Handler successor;

	public void SetSuccessor(Handler successor) {//���ü�����
		this.successor = successor;
	}
	
	public abstract void HandleRequest(int request);//��������ĳ��󷽷�
}
