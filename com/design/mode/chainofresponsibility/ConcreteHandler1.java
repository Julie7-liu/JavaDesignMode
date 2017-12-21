package com.design.mode.chainofresponsibility;

/*ConcreteHandler1类，具体处理者类，处理它所负责的请求，可访问它的后继者.
 *如果可处理该请求，就处理之，否则就将该请求转发给它的后继者。
 *ConcreteHandler1，当请求数在0到10之间则有权处理，否则转到下一位。*/
public class ConcreteHandler1 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
        if(request>=0 && request<10)//0到10，处理此请求
        {
        	System.out.printf("%s处理请求%s\n",this.getClass().getName(),request);
        }
        else if(successor!=null)
        {
        	successor.HandleRequest(request);//转移到下一位
        }
	}

}
