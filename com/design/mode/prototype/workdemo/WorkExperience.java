package com.design.mode.prototype.workdemo;

//�������� ʵ��Clonable�ӿ�ʵ����ȸ���
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
	//ʵ�ֿ�¡����
	public Object Clone() throws CloneNotSupportedException
	{
		return (Object)this.clone();
	}
}
