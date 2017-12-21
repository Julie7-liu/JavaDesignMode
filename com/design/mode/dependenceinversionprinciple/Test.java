package com.design.mode.dependenceinversionprinciple;

public class Test {
	public static void main(String[] args) {
		AutoSystem as=new AutoSystem(new BmwCar()); 
		as.RunCar();
		as.TurnCar();
		as.StopCar();
	}
}
