package com.design.mode.publicsubscribe;

/*
 * ConcreteSubject�࣬����������������֪ͨ�ߣ�
 * ���й�״̬��������ֹ۲��߶����ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ��
 * ���������ɫͨ����һ����������ʵ��*/
public class ConcreteSubject extends Subject {
    private String subjectState;
    //���屻�۲���״̬
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
    
}
