package com.design.mode.singleton;
/*
 *饿汉式单例：静态初始化方式是在自己被加载时就将自己实例化 */
public class SingletonStatic {
   private static SingletonStatic instance=new SingletonStatic();
   private SingletonStatic(){}
   public static SingletonStatic GetInstance()
   {
	   return instance;
   }
}
