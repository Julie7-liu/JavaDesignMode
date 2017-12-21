package com.design.mode.abstractfactory;

 
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = new User();
		Department dept = new Department();
		
		
		//抽象工厂实现方式
		/*IFactory factory=new AccessFactory();
		IUser iu = factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment id=factory.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);*/
		
		//简单工厂是实现方式（反射）		
		IUser iu = DataAccess.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment id=DataAccess.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);
	}

}
