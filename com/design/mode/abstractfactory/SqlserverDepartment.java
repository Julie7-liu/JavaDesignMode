package com.design.mode.abstractfactory;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		// TODO Auto-generated method stub
	    System.out.println("��SQL Server�е�Department������һ����¼");
	}

	@Override
	public Department GetDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server�и���ID�õ�Department��һ����¼");
		return null;
	}

 
}
