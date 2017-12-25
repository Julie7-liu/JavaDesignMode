package com.design.mode.singleton;

import java.util.concurrent.locks.ReentrantLock;

/*
 * ˫������ʵ����Double-Check Locking��
 * ����Ӱ�����ܣ�ʹ��˫���������ж�instance�Ƿ���ڣ��������ټ�������ͬʱҲ�ܱ�֤���̵߳İ�ȫ*/
public class SingletonDoubleLock {
	private static SingletonDoubleLock instance;
	static ReentrantLock lock = new ReentrantLock();

	public static SingletonDoubleLock GetInstance() {
		if (instance == null) {
			// lock��ȷ����һ���߳�λ�ڴ�����ٽ���ʱ����һ���̲߳������ٽ�������������߳���ͼ���������Ĵ��룬������һֱ�ȴ���������ֹ����ֱ���ö����ͷ�
			lock.lock();
			try {
				//�����ٽ���һ���ж�ԭ�������߳�һ�������ٽ�������һ�������ŶӵȺ򣬱���Ҫ����һ�����벢��������һ�����ܽ��롣����ʱ���û���˵ڶ��ص�instance�Ƿ�Ϊnull���жϣ����һ���̴߳�����ʵ�������ڶ����̻߳��ǿ��Լ����ٴ����µ�ʵ�������û�дﵽ������Ŀ��
				if (instance == null) {
					instance = new SingletonDoubleLock();
				}
				return instance;
			} catch (Exception ex) {
				System.out.println(ex.getMessage().toString());
			} finally {
				lock.unlock(); // �ͷ���
				// return instance;
			}
		}
		return instance;
	}
}
