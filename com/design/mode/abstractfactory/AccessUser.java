package com.design.mode.abstractfactory;

public class AccessUser implements IUser {

	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
		  System.out.println("��Access�е�User������һ����¼");
	}

	@Override
	public User GetUser(int id) {
		// TODO Auto-generated method stub
		 System.out.println("��Access�и���ID�õ�User��һ����¼");
		return null;
	}

}
