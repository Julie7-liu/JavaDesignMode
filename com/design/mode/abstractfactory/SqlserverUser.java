package com.design.mode.abstractfactory;

public class SqlserverUser implements IUser {

	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
        System.out.println("��SQL Server�е�User������һ����¼");
	}

	@Override
	public User GetUser(int id) {
		// TODO Auto-generated method stub
		 System.out.println("��SQL Server�и���ID�õ�User��һ����¼");
		return null;
	}

}
