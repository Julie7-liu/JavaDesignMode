package com.design.mode.abstractfactory;

 
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = new User();
		Department dept = new Department();
		
		
		//���󹤳�ʵ�ַ�ʽ
		/*IFactory factory=new AccessFactory();
		IUser iu = factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment id=factory.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);*/
		
		//�򵥹�����ʵ�ַ�ʽ�����䣩		
		IUser iu = DataAccess.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		IDepartment id=DataAccess.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);
	}

}
