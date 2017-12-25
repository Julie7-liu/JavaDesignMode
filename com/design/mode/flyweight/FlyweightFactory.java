package com.design.mode.flyweight;

import java.util.Hashtable;

/*
 * ��Ԫ��������������������Flyweight��������Ҫ������ȷ������ع���Flyweight����
 */
public class FlyweightFactory {
   private Hashtable flyweights=new Hashtable();
   
   public FlyweightFactory()
   {
	   flyweights.put("X", new ConcreteFlyweight());
	   flyweights.put("Y", new ConcreteFlyweight());
	   flyweights.put("Z", new ConcreteFlyweight());
   }
   
   public Flyweight GetFlyweight(String key)
   {
	   return ((Flyweight)flyweights.get(key));
   }
}
