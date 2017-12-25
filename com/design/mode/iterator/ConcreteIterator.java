package com.design.mode.iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;//定义了一个具体聚合对象
	private int current=0;
	
	//初始化时将具体的聚集对象传入
	public ConcreteIterator(ConcreteAggregate aggregate)
	{
		this.aggregate=aggregate;
	}
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return null;
		//return aggregate[0];
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		Object ret=null;
		current++;
		if(current<aggregate.getCount())
		{
			//ret=aggregate[current];
		}
		return ret;
	}

	@Override
	public Boolean IsDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.getCount()?true:false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return null;
		//return aggregate[current];
	}

}
