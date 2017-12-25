package com.design.mode.prototype;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototyel pl=new ConcretePrototyel("I");
		ConcretePrototyel c1 = null;
		try {
			c1 = (ConcretePrototyel)pl.Clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Cloned:%s",c1.getId());
	}

}
