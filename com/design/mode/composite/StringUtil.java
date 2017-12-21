package com.design.mode.composite;

public class StringUtil{
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public StringUtil(char c,int depth)
	{ 
		 char[] depthchar=new char[depth];
		 for(int i=0;i<depth;i++)
		 {
			 depthchar[i]=c;
		 }
		 this.value=new String(depthchar); 
	}
	 public static String doChartoString(char c,int depth)
	 {
		 String result="";
		 char[] depthchar=new char[depth];
		 for(int i=0;i<depth;i++)
		 {
			 depthchar[i]=c;
		 }
		 result=depthchar.toString();
		 return result;
	 }
}
