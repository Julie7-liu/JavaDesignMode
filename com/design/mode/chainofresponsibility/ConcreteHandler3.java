package com.design.mode.chainofresponsibility;


 /*ConcreteHandler1������������0��30֮������Ȩ��������ת����һλ��*/
public class ConcreteHandler3 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
        if(request>=20 && request<30)//20��30�����������
        {
        	System.out.printf("%s��������%s\n",this.getClass().getName(),request);
        }
        else if(successor!=null)
        {
        	successor.HandleRequest(request);//ת�Ƶ���һλ
        }
	}

}
