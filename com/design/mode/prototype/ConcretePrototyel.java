package com.design.mode.prototype;

public class ConcretePrototyel extends Prototype {

	public ConcretePrototyel(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prototype Clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//������ǰ�����ǳ�����������Ǵ���һ���µĶ���Ȼ�󽫵�ǰ����ķǾ�̬�ֶθ��Ƶ����¶���
		//����ֶ���ֵ���ͣ���Ը��ֶ�ִ����λ���ơ�����ֶ����������ͣ��������õ����������õĶ���
		//��ˣ�ԭʼ�����丱������ͬһ������
		return (Prototype)this.clone();
	}

}
