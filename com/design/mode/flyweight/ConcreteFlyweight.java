package com.design.mode.flyweight;

/*
 * �̳�Flyweight�����ʵ��Flyweight�ӿڣ���Ϊ�ڲ�״̬���Ӵ洢�ռ�
 */
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void Opeartion(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("Flyweight:" + extrinsicstate);
	}

}
