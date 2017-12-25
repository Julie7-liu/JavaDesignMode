package com.design.mode.prototype.workdemo;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
       Resume a=new Resume("大鸟");
       a.SetPersonalInfo("男", "29");
       a.SetWorkExperience("1998-2000", "xx公司");
       
       Resume b=(Resume)a.Clone();
       b.SetWorkExperience("1998-2000", "xx企业");
       
       Resume c=(Resume)a.Clone();
       c.SetWorkExperience("1998-2000", "xx上市");
       
       a.Display();
       b.Display();
       c.Display();
	}

}
