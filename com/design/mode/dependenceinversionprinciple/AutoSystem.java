package com.design.mode.dependenceinversionprinciple;

public class AutoSystem {
private ICar icar;
public AutoSystem(ICar icar)
{
	this.icar=icar;
}
public void RunCar()
{
	icar.Run();
}
public void TurnCar()
{
	icar.Trun();
}
public void StopCar()
{
	icar.Stop();
}
}
