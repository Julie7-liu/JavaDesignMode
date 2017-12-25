package com.design.mode.publicsubscribe;

/*
 *ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э����
 *����۲��߽�ɫ���Ա���һ��ָ����������������á�����۲��߽�ɫͨ����һ����������ʵ�֡� */
public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject,String name)
	{
		this.subject=subject;
		this.name=name;
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
        observerState=subject.getSubjectState();
        System.out.printf("�۲���%s����״̬��%s\n",name,observerState);
	}
	public ConcreteSubject getSubject() {
		return subject;
	}
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	 

}
