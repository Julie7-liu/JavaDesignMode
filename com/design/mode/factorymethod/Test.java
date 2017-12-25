package com.design.mode.factorymethod;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeiFeng xueleifeng = new Undergraduate();
		xueleifeng.BuyRice();
		xueleifeng.Sweep();
		xueleifeng.Wash();
		
		IFactory factory=new UndergraduateFactory();
		LeiFeng student=factory.CreateLeiFeng();
		student.BuyRice();
		student.Sweep();
		student.Wash();
	}

}
