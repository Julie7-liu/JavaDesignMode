package com.design.mode.iterator;

import java.util.*;

public class ConcreteAggregate extends Aggregate {

	//声明一个IList泛型变量用于存放聚合对象，用ArrayList同样可以实现
	private List<Object> items=new ArrayList<Object>();
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	private int count;

	public int getCount() {
		return items.size();
	}
	
	//public Object this[int index]{ 
	//}
	
}
