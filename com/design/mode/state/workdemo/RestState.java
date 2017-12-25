package com.design.mode.state.workdemo;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
			System.out.printf("当前时间：%s点 下班回家了\n", w.getHour());
		 
	}

}
