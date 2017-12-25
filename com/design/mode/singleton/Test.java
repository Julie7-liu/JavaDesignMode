package com.design.mode.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.GetInstance();
		Singleton s2 = Singleton.GetInstance();
		if (s1 == s2) {
			System.out.println("两个对象是相同的实例");
		}
		
		//SingletonStatic ss=SingletonStatic.GetInstance();
	}
}
