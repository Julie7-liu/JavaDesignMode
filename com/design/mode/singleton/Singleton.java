package com.design.mode.singleton;

public class Singleton {

   private static Singleton instance;
   //构造方法让其private，这就堵死了外界利用new创建此类实例的可能
   private Singleton()
   {
	   
   }
   //此方法是或得本类实例的唯一全局访问点
   public static Singleton GetInstance()
   {
	   //若实例不存在，则new一个新实例，否则返回已有的实例
	   if(instance==null)
	   {
		   instance=new Singleton();
	   }
	   return instance;
   }
}
