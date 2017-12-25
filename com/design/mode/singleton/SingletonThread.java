package com.design.mode.singleton;

import java.util.concurrent.locks.ReentrantLock;

/*多线程时的单例
 * 这段代码使得对象实例由最先进入的那个线程创建，以后的线程在进入时不会再去创建对象实例了。
 * 由于有了lock,就保证了多线程环境下的同时访问也不会造成多个实例的生成。
*/
public class SingletonThread {
private static SingletonThread instance;
static ReentrantLock  lock = new ReentrantLock();
public static SingletonThread GetInstance()
{
	//lock是确保当一个线程位于代码的临界区时，另一个线程不进入临界区。如果其他线程试图进入锁定的代码，则它将一直等待（即被阻止），直到该对象被释放
	lock.lock();
	try{
	    //处理任务
		if(instance==null)
		{
			instance=new SingletonThread();
		}
		return instance;
	}catch(Exception ex){
	     System.out.println(ex.getMessage().toString());
	}finally{
		lock.unlock();   //释放锁
		return instance;
	}
}
}
