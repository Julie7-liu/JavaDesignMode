package com.design.mode.singleton;

import java.util.concurrent.locks.ReentrantLock;

/*���߳�ʱ�ĵ���
 * ��δ���ʹ�ö���ʵ�������Ƚ�����Ǹ��̴߳������Ժ���߳��ڽ���ʱ������ȥ��������ʵ���ˡ�
 * ��������lock,�ͱ�֤�˶��̻߳����µ�ͬʱ����Ҳ������ɶ��ʵ�������ɡ�
*/
public class SingletonThread {
private static SingletonThread instance;
static ReentrantLock  lock = new ReentrantLock();
public static SingletonThread GetInstance()
{
	//lock��ȷ����һ���߳�λ�ڴ�����ٽ���ʱ����һ���̲߳������ٽ�������������߳���ͼ���������Ĵ��룬������һֱ�ȴ���������ֹ����ֱ���ö����ͷ�
	lock.lock();
	try{
	    //��������
		if(instance==null)
		{
			instance=new SingletonThread();
		}
		return instance;
	}catch(Exception ex){
	     System.out.println(ex.getMessage().toString());
	}finally{
		lock.unlock();   //�ͷ���
		return instance;
	}
}
}
