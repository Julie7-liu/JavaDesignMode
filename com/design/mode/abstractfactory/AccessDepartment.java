package com.design.mode.abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		// TODO Auto-generated method stub
		 System.out.println("��Access�е�Department������һ����¼");
	}

	@Override
	public Department GetDepartment(int id) {
		// TODO Auto-generated method stub
		 System.out.println("��Access�и���ID�õ�Department��һ����¼");
		return null;
	}

}
