package com.design.mode.iterator;

import java.util.*;

public class ConcreteAggregate extends Aggregate {

	//����һ��IList���ͱ������ڴ�žۺ϶�����ArrayListͬ������ʵ��
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
