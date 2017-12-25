package com.design.mode.singleton;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 双重锁定实例（Double-Check Locking）
 * 单锁影响性能，使用双重锁事先判断instance是否存在，不存在再加锁处理，同时也能保证多线程的安全*/
public class SingletonDoubleLock {
	private static SingletonDoubleLock instance;
	static ReentrantLock lock = new ReentrantLock();

	public static SingletonDoubleLock GetInstance() {
		if (instance == null) {
			// lock是确保当一个线程位于代码的临界区时，另一个线程不进入临界区。如果其他线程试图进入锁定的代码，则它将一直等待（即被阻止），直到该对象被释放
			lock.lock();
			try {
				//这里再进行一道判断原因：两个线程一个进入临界区，另一个在外排队等候，必须要其中一个进入并出来后，另一个才能进入。而此时如果没有了第二重的instance是否为null的判断，则第一个线程创建了实例，而第二个线程还是可以继续再创建新的实例，这就没有达到单例的目的
				if (instance == null) {
					instance = new SingletonDoubleLock();
				}
				return instance;
			} catch (Exception ex) {
				System.out.println(ex.getMessage().toString());
			} finally {
				lock.unlock(); // 释放锁
				// return instance;
			}
		}
		return instance;
	}
}
