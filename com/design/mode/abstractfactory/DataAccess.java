package com.design.mode.abstractfactory;

public class DataAccess {
  private static final String db="Sqlserver";
  private static final String AssemblyName="com.design.mode.abstractfactory";
  
  public static IUser CreateUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	 /* IUser result=null;
	  switch(db)
	  {
	  case "SqlServer":
		  result=new SqlserverUser();
		  break;
	  case "Access":
		  result=new AccessUser();
		  break;
	  }
	  return result;*/
	  String className=AssemblyName+"."+db+"User";
	  Class cla=Class.forName(className);
	  return (IUser)cla.newInstance();
  }
  
  public static IDepartment CreateDepartment() throws ClassNotFoundException, InstantiationException, IllegalAccessException
  {
	  /* IDepartment result=null;
	  switch(db)
	  {
	  case "SqlServer":
		  result=new SqlserverDepartment();
		  break;
	  case "Access":
		  result=new AccessDepartment();
		  break;
	  }
	  return result;*/
	  //∑¥…‰
	  String className=AssemblyName+"."+db+"Department";
	  Class cla=Class.forName(className);
	  return (IDepartment)cla.newInstance();
  }
}
