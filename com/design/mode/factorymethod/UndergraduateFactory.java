package com.design.mode.factorymethod;

public class UndergraduateFactory implements IFactory{

	@Override
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
