package com.design.mode.chainofresponsibility;


 /*ConcreteHandler1������������0��20֮������Ȩ��������ת����һλ��*/
public class ConcreteHandler2 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
        if(request>=10 && request<20)//10��20�����������
        {
        	System.out.printf("%s��������%s\n",this.getClass().getName(),request);
        }
        else if(successor!=null)
        {
        	successor.HandleRequest(request);//ת�Ƶ���һλ
        }
	}

}
