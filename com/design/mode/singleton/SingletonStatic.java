package com.design.mode.singleton;
/*
 *����ʽ��������̬��ʼ����ʽ�����Լ�������ʱ�ͽ��Լ�ʵ���� */
public class SingletonStatic {
   private static SingletonStatic instance=new SingletonStatic();
   private SingletonStatic(){}
   public static SingletonStatic GetInstance()
   {
	   return instance;
   }
}
