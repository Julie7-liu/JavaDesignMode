package com.design.mode.flyweight;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicstate = 22;

		FlyweightFactory f=new FlyweightFactory();
		
		Flyweight fx=f.GetFlyweight("X");
		fx.Opeartion(--extrinsicstate);
		
		Flyweight fy=f.GetFlyweight("Y");
		fy.Opeartion(--extrinsicstate);
		
		Flyweight fz=f.GetFlyweight("Z");
		fz.Opeartion(--extrinsicstate);
		
		UnshareConcreteFlyweight uf=new UnshareConcreteFlyweight();
		uf.Opeartion(--extrinsicstate);
	}

}
