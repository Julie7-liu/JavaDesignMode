package com.design.mode.prototype.workdemo;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
       Resume a=new Resume("����");
       a.SetPersonalInfo("��", "29");
       a.SetWorkExperience("1998-2000", "xx��˾");
       
       Resume b=(Resume)a.Clone();
       b.SetWorkExperience("1998-2000", "xx��ҵ");
       
       Resume c=(Resume)a.Clone();
       c.SetWorkExperience("1998-2000", "xx����");
       
       a.Display();
       b.Display();
       c.Display();
	}

}
