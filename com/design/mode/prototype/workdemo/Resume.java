package com.design.mode.prototype.workdemo;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;

	//构造简历，同时实例化工作经历
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	private Resume(WorkExperience work) throws CloneNotSupportedException
	{
		this.work=(WorkExperience)work.Clone();
	}
	
	//设置个人信息
	public void SetPersonalInfo(String sex,String age)
	{
		this.sex=sex;
		this.age=age;
	}
	
	public void SetWorkExperience(String workDate,String company)
	{
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	//显示
	public void Display()
	{
		System.out.printf("%s %s %s",name,sex,age);
		System.out.printf("工作经历：%s %s",work.getWorkDate(),work.getCompany());
	}
	
	public Object Clone() throws CloneNotSupportedException
	{
		Resume obj=new Resume(this.work);
		obj.name=this.name;
		obj.sex=this.sex;
		obj.age=this.age;
		return obj;
		//return (Object)this.clone();
	}
}
