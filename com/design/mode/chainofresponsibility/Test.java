package com.design.mode.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		h1.SetSuccessor(h2);// 设置职责链上家与下家
		h2.SetSuccessor(h3);

		int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };

		for (int request : requests) {
			h1.HandleRequest(request);
		}
	}

}
