package com.design.mode.chainofresponsibility;


 /*ConcreteHandler1，当请求数在0到30之间则有权处理，否则转到下一位。*/
public class ConcreteHandler3 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
        if(request>=20 && request<30)//20到30，处理此请求
        {
        	System.out.printf("%s处理请求%s\n",this.getClass().getName(),request);
        }
        else if(successor!=null)
        {
        	successor.HandleRequest(request);//转移到下一位
        }
	}

}
