package com.design.mode.flyweight.website;

public class ConcreteWebSite extends WebSite {

	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
		System.out.println("��վ����:" + name+"�û���"+user.getName());
	}

}
