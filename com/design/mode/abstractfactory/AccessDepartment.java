package com.design.mode.abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		// TODO Auto-generated method stub
		 System.out.println("在Access中的Department表增加一条记录");
	}

	@Override
	public Department GetDepartment(int id) {
		// TODO Auto-generated method stub
		 System.out.println("在Access中根据ID得到Department表一条记录");
		return null;
	}

}
