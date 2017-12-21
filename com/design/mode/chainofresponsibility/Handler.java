package com.design.mode.chainofresponsibility;

//定义一个处理请示的接口
public abstract class Handler {
	protected Handler successor;

	public void SetSuccessor(Handler successor) {//设置继任者
		this.successor = successor;
	}
	
	public abstract void HandleRequest(int request);//处理请求的抽象方法
}
