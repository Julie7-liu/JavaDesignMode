package com.design.mode.flyweight.website;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebSiteFactory f=new WebSiteFactory();
      
      WebSite fx=f.GetWebSiteCategory("��Ʒչʾ");
      fx.Use(new User("С��"));
      
      WebSite fy=f.GetWebSiteCategory("��Ʒչʾ");
      fy.Use(new User("����"));
      
      WebSite fz=f.GetWebSiteCategory("��Ʒչʾ");
      fz.Use(new User("����"));
      
      WebSite fl=f.GetWebSiteCategory("����");
      fl.Use(new User("����ͯ"));
      
      WebSite fm=f.GetWebSiteCategory("����");
      fm.Use(new User("�ҹ�����"));
      
      WebSite fn=f.GetWebSiteCategory("����");
      fn.Use(new User("�Ϻ�����"));
      
      System.out.printf("��վ��������Ϊ%s",f.GetWebSiteCount());
	}

}
