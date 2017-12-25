package com.design.mode.prototype;

public class ConcretePrototyel extends Prototype {

	public ConcretePrototyel(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prototype Clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//创建当前对象的浅表副本。方法是创建一个新的对象，然后将当前对象的非静态字段复制到该新对象。
		//如果字段是值类型，则对该字段执行逐位复制。如果字段是引用类型，则复制引用但不复制引用的对象
		//因此，原始对象及其副本引用同一个对象
		return (Prototype)this.clone();
	}

}
