package com.design.mode.abstractfactory;

public class AccessUser implements IUser {

	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
		  System.out.println("在Access中的User表增加一条记录");
	}

	@Override
	public User GetUser(int id) {
		// TODO Auto-generated method stub
		 System.out.println("在Access中根据ID得到User表一条记录");
		return null;
	}

}
