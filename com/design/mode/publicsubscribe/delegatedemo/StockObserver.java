package com.design.mode.publicsubscribe.delegatedemo;


//����Ʊ��ͬ��
public class StockObserver {
	private String name;
	private Subject sub;

	public StockObserver(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	//�رչ�Ʊ����
	public void CloseStockMarket()
	{
		System.out.printf("%s %s �رչ�Ʊ���飬��������!",sub);
	}
}
