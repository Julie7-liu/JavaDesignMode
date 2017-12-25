package com.design.mode.singleton;

public class Singleton {

   private static Singleton instance;
   //���췽������private����Ͷ������������new��������ʵ���Ŀ���
   private Singleton()
   {
	   
   }
   //�˷����ǻ�ñ���ʵ����Ψһȫ�ַ��ʵ�
   public static Singleton GetInstance()
   {
	   //��ʵ�������ڣ���newһ����ʵ�������򷵻����е�ʵ��
	   if(instance==null)
	   {
		   instance=new Singleton();
	   }
	   return instance;
   }
}
