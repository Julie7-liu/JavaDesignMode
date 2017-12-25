package com.design.mode.flyweight;

/*
 * UnshareConcreteFlyweight
 */
public class UnshareConcreteFlyweight extends Flyweight {

	@Override
	public void Opeartion(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight:" + extrinsicstate);
	}

}
