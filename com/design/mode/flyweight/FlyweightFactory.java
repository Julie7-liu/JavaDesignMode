package com.design.mode.flyweight;

import java.util.Hashtable;

/*
 * 享元工厂，用来创建并管理Flyweight对象。它主要是用来确保合理地共享Flyweight，当
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
