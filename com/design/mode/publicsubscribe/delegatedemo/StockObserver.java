package com.design.mode.publicsubscribe.delegatedemo;


//看股票的同事
public class StockObserver {
	private String name;
	private Subject sub;

	public StockObserver(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	//关闭股票行情
	public void CloseStockMarket()
	{
		System.out.printf("%s %s 关闭股票行情，继续工作!",sub);
	}
}
