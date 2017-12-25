package com.design.mode.flyweight;

/*
 * 继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间
 */
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void Opeartion(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("Flyweight:" + extrinsicstate);
	}

}
