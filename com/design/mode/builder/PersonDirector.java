package com.design.mode.builder;

public class PersonDirector {
private PersonBuilder pb;
public PersonDirector(PersonBuilder pb)//�û�����ָ���ߣ�����Ҫʲô����С��
{
	this.pb=pb;
}
public void CreatePerson()//�����û�ѡ����С��
{
	pb.BuildHead();
	pb.BuildBody();
	pb.BuildArmLeft();
	pb.BuildArmRight();
	pb.BuildLegLeft();
	pb.BuildLegRight();
}
}
