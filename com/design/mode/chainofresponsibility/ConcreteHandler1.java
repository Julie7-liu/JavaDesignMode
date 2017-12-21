package com.design.mode.chainofresponsibility;

/*ConcreteHandler1�࣬���崦�����࣬����������������󣬿ɷ������ĺ����.
 *����ɴ�������󣬾ʹ���֮������ͽ�������ת�������ĺ���ߡ�
 *ConcreteHandler1������������0��10֮������Ȩ��������ת����һλ��*/
public class ConcreteHandler1 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
        if(request>=0 && request<10)//0��10�����������
        {
        	System.out.printf("%s��������%s\n",this.getClass().getName(),request);
        }
        else if(successor!=null)
        {
        	successor.HandleRequest(request);//ת�Ƶ���һλ
        }
	}

}
