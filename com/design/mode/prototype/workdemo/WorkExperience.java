package com.design.mode.prototype.workdemo;

//工作经历 实现Clonable接口实现深度复制
public class WorkExperience implements Cloneable {
	private String workDate;
	private String company;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	//实现克隆方法
	public Object Clone() throws CloneNotSupportedException
	{
		return (Object)this.clone();
	}
}
