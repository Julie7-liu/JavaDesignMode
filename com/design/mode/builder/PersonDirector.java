package com.design.mode.builder;

public class PersonDirector {
private PersonBuilder pb;
public PersonDirector(PersonBuilder pb)//用户告诉指挥者，我需要什么样的小人
{
	this.pb=pb;
}
public void CreatePerson()//根据用户选择建造小人
{
	pb.BuildHead();
	pb.BuildBody();
	pb.BuildArmLeft();
	pb.BuildArmRight();
	pb.BuildLegLeft();
	pb.BuildLegRight();
}
}
