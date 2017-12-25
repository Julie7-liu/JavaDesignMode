package com.design.mode.state.workdemo;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
			System.out.printf("当前时间：%s点 不行了，睡着了\n", w.getHour());
		 
	}

}
